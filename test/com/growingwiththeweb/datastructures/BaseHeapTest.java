package com.growingwiththeweb.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public abstract class BaseHeapTest {
    protected HeapInterface heap;

    @Before
    public abstract void setUp();

    @After
    public void tearDown() {
        heap = null;
    }

    @Test
    public void testInsert() {
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        assertEquals(heap.size(), 5);
    }

    @Test
    public void testExtractMinimumWithEmptyHeap() {
        assertEquals(heap.extractMin(), null);
    }

    @Test
    public void testExtractMinimumItems() {
        heap.insert(5);
        heap.insert(3);
        heap.insert(4);
        heap.insert(1);
        heap.insert(2);
        assertSame(heap.extractMin(), 1);
        assertSame(heap.extractMin(), 2);
        assertSame(heap.extractMin(), 3);
        assertSame(heap.extractMin(), 4);
        assertSame(heap.extractMin(), 5);
    }
}
