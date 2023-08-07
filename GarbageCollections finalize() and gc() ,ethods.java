class GarbageCollections
{
    public void finalize()
    {
        System.out.println("garbage is collected");
    }
    public static void main(String args[])
    {
        GarbageCollections g1 = new GarbageCollections();
        GarbageCollections g2 = new GarbageCollections();
        g1 = null;
        g2 = null;
        System.gc();
    }
}
/*
garbage is collected
garbage is collected
*/
