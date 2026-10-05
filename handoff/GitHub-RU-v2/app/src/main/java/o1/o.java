package o1;

/* loaded from: /home/user/work/p/classes.dex */
public final class o extends n {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29938u;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f29938u) {
            case k5.f.J /* 0 */:
                int i = this.f29937t;
                this.f29937t = i + 2;
                Object[] objArr = this.f29935r;
                return new a(0, objArr[i], objArr[i + 1]);
            case 1:
                int i10 = this.f29937t;
                this.f29937t = i10 + 2;
                return this.f29935r[i10];
            default:
                int i11 = this.f29937t;
                this.f29937t = i11 + 2;
                return this.f29935r[i11 + 1];
        }
    }
}
