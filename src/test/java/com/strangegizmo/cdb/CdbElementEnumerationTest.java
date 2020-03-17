package com.strangegizmo.cdb;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;

import static org.junit.Assert.*;

public class CdbElementEnumerationTest {
    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    private File cdb;

    @Before
    public void createCdbFile() throws IOException {
        cdb = temp.newFile("test.cdb");
        try(OutputStream out = new FileOutputStream(cdb)) {
            InputStream cdbStream = DumpTest.class.getResourceAsStream("/test.cdb");
            // copy
            IOUtils.copy(cdbStream, out);
            out.flush();
        }
    }

    @Test
    public void testEnumeration() throws IOException {
        CdbElementEnumeration subject = Cdb.elements(cdb);
        assertNotNull(subject);

        assertTrue(subject.hasMoreElements());
        CdbElement element = subject.nextElement();
        assertNotNull(element);
        assertEquals("one", new String(element.getKey()));
        assertEquals("Hello", new String(element.getData()));

        assertTrue(subject.hasMoreElements());
        element = subject.nextElement();
        assertNotNull(element);
        assertEquals("two", new String(element.getKey()));
        assertEquals("Goodbye", new String(element.getData()));

        assertFalse(subject.hasMoreElements());

        subject.close();
    }
}