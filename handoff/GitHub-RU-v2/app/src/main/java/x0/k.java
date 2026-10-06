package x0;

import com.google.android.gms.measurement.internal.x3;
import w3.z;

/* loaded from: /home/user/work/p/classes.dex */
public final class k implements z {

    /* renamed from: r, reason: collision with root package name */
    public x3 f33680r;

    /* renamed from: s, reason: collision with root package name */
    public s3.l f33681s;

    /* renamed from: t, reason: collision with root package name */
    public s3.m f33682t;

    /* renamed from: u, reason: collision with root package name */
    public s3.l f33683u;

    /* renamed from: v, reason: collision with root package name */
    public s3.j f33684v;

    public k(x3 x3Var) {
        this.f33680r = x3Var;
    }

    @Override // w3.z
    public final long c(s3.k kVar, long j10, s3.m mVar, long j11) {
        s3.j jVar = this.f33684v;
        if (jVar != null) {
            s3.l lVar = this.f33681s;
            if ((lVar == null ? false : s3.l.a(lVar.f31703a, j10)) && this.f33682t == mVar) {
                s3.l lVar2 = this.f33683u;
                if (lVar2 != null ? s3.l.a(lVar2.f31703a, j11) : false) {
                    return jVar.f31697a;
                }
            }
        }
        long c10 = this.f33680r.c(kVar, j10, mVar, j11);
        this.f33681s = new s3.l(j10);
        this.f33682t = mVar;
        this.f33683u = new s3.l(j11);
        this.f33684v = new s3.j(c10);
        return c10;
    }
}
