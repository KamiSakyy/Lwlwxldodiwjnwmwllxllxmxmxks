package h91;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes5.dex */
public final class v implements Closeable {
    public final boolean r;
    public boolean s;
    public int t;
    public final ReentrantLock u = new ReentrantLock();
    public final RandomAccessFile v;

    public v(boolean z, RandomAccessFile randomAccessFile) {
        this.r = z;
        this.v = randomAccessFile;
    }

    public static m f(v vVar) {
        if (!vVar.r) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = vVar.u;
        reentrantLock.lock();
        try {
            if (vVar.s) {
                throw new IllegalStateException("closed");
            }
            vVar.t++;
            reentrantLock.unlock();
            return new m(vVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.u;
        reentrantLock.lock();
        try {
            if (this.s) {
                return;
            }
            this.s = true;
            if (this.t != 0) {
                return;
            }
            synchronized (this) {
                this.v.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.r) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.u;
        reentrantLock.lock();
        try {
            if (this.s) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.v.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final n m(long j) {
        ReentrantLock reentrantLock = this.u;
        reentrantLock.lock();
        try {
            if (this.s) {
                throw new IllegalStateException("closed");
            }
            this.t++;
            reentrantLock.unlock();
            return new n(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.u;
        reentrantLock.lock();
        try {
            if (this.s) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.v.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
