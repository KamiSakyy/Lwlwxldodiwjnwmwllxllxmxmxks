package m7;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public long[] f29010b;

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f29011c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f29012d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f29014f;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f29009a = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f29013e = new ReentrantLock();

    public k(int i) {
        this.f29010b = new long[i];
        this.f29011c = new boolean[i];
    }
}
