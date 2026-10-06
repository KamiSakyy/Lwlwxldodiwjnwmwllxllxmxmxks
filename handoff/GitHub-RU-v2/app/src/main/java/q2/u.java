package q2;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long f30890a;

    /* renamed from: b, reason: collision with root package name */
    public long f30891b;

    /* renamed from: c, reason: collision with root package name */
    public long f30892c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30893d;

    /* renamed from: e, reason: collision with root package name */
    public float f30894e;

    /* renamed from: f, reason: collision with root package name */
    public long f30895f;

    /* renamed from: g, reason: collision with root package name */
    public long f30896g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30897h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f30898j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f30899k;
    public long l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30900n;

    /* renamed from: o, reason: collision with root package name */
    public u f30901o;

    public u(long j10, long j11, long j12, boolean z10, float f6, long j13, long j14, boolean z11, boolean z12, int i, long j15) {
        this.f30890a = j10;
        this.f30891b = j11;
        this.f30892c = j12;
        this.f30893d = z10;
        this.f30894e = f6;
        this.f30895f = j13;
        this.f30896g = j14;
        this.f30897h = z11;
        this.i = i;
        this.f30898j = j15;
        this.l = 0L;
        this.m = z12;
        this.f30900n = z12;
    }

    public final void a() {
        u uVar = this.f30901o;
        if (uVar == null) {
            this.m = true;
            this.f30900n = true;
        } else if (uVar != null) {
            uVar.a();
        }
    }

    public final boolean b() {
        u uVar = this.f30901o;
        return uVar != null ? uVar.b() : this.m || this.f30900n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) t.j(this.f30890a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f30891b);
        sb2.append(", position=");
        sb2.append((Object) c2.b.h(this.f30892c));
        sb2.append(", pressed=");
        sb2.append(this.f30893d);
        sb2.append(", pressure=");
        sb2.append(this.f30894e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f30895f);
        sb2.append(", previousPosition=");
        sb2.append((Object) c2.b.h(this.f30896g));
        sb2.append(", previousPressed=");
        sb2.append(this.f30897h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        sb2.append((Object) d0.a(this.i));
        sb2.append(", historical=");
        x61.rShadow rVar = this.f30899k;
        if (rVar == null) {
            rVar = x61.rShadow.r;
        }
        sb2.append(rVar);
        sb2.append(",scrollDelta=");
        sb2.append((Object) c2.b.h(this.f30898j));
        sb2.append(')');
        return sb2.toString();
    }

    public u(long j10, long j11, long j12, boolean z10, float f6, long j13, long j14, boolean z11, int i, ArrayList arrayList, long j15, long j16) {
        this(j10, j11, j12, z10, f6, j13, j14, z11, false, i, j15);
        this.f30899k = arrayList;
        this.l = j16;
    }
    public Object c = null;
}
