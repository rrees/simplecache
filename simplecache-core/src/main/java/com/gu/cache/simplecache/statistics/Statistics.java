package com.gu.cache.simplecache.statistics;

public class Statistics {
    private final long numEntries;
    private final long numHits;
    private final long numMisses;
    private final long numWrites;
    private final long numRemoves;
    private final long numRemoveAlls;
    private final long numServeStales;

    public Statistics(
            long numEntries,
            long numHits,
            long numMisses,
            long numWrites,
            long numRemoves,
            long numRemoveAlls,
            long numServeStales) {
        this.numEntries = numEntries;
        this.numHits = numHits;
        this.numMisses = numMisses;
        this.numWrites = numWrites;
        this.numRemoves = numRemoves;
        this.numRemoveAlls = numRemoveAlls;
        this.numServeStales = numServeStales;
    }

    public long getNumEntries() {
        return numEntries;
    }

    public long getNumHits() {
        return numHits;
    }

    public long getNumMisses() {
        return numMisses;
    }

    public long getNumWrites() {
        return numWrites;
    }

    public long getNumRemoves() {
        return numRemoves;
    }

    public long getNumRemoveAlls() {
        return numRemoveAlls;
    }

    public long getNumServeStales() {
        return numServeStales;
    }

    public long getNumReads() {
        return numHits + numMisses;
    }

    public double getHitRatio() {
        return numHits / (double) getNumReads();
    }
}
