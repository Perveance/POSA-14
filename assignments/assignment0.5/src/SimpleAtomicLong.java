// Import the necessary Java synchronization and scheduling classes.

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;
    
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - replace the null with the appropriate initialization:
    private ReentrantReadWriteLock mRWLock = null;

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
    public SimpleAtomicLong(long initialValue)
    {
        // TODO - you fill in here
    	mRWLock = new ReentrantReadWriteLock();
    }

    /**
     * @brief Gets the current value.
     * 
     * @returns The current value
     */
    public long get()
    {
        long value;
        
        mRWLock.readLock().lock();
        
        try {
        	
        	value = mValue;
        	
        } finally {
        	mRWLock.readLock().unlock();
        }
        // TODO - you fill in here, using a readLock()
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
    public long decrementAndGet()
    {
        long value;
        
        mRWLock.writeLock().lock();
        
        try {
        	
        	value = --mValue;
        	
        } finally {
        	
        	mRWLock.writeLock().unlock();
        	
        }
        // TODO - you fill in here, using a writeLock()
        return value;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
    public long getAndIncrement()
    {
        long value;
        
        mRWLock.writeLock().lock();
        
        try {
        	
        	value = mValue++;
        	
        } finally {
        	
        	mRWLock.writeLock().unlock();
        	
        }
        // TODO - you fill in here, using a writeLock()
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
    public long getAndDecrement()
    {
        long value;
        
        mRWLock.writeLock().lock();
        
        try {
        	
        	value = mValue--;
        	
        } finally {
        	
        	mRWLock.writeLock().unlock();
        	
        }
        // TODO - you fill in here, using a writeLock()
        return value;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
    public long incrementAndGet()
    {
        long value;
        
        mRWLock.writeLock().lock();
        
        try {
        	
        	value = ++mValue;
        	
        } finally {
        	
        	mRWLock.writeLock().unlock();
        	
        }
        
        // TODO - you fill in here, using a writeLock()
        return value;
    }
}

