package v8;

import java.util.HashSet;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public UUID f32802a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f32803b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f32804c;

    /* renamed from: d, reason: collision with root package name */
    public i f32805d;

    /* renamed from: e, reason: collision with root package name */
    public i f32806e;

    /* renamed from: f, reason: collision with root package name */
    public int f32807f;

    /* renamed from: g, reason: collision with root package name */
    public int f32808g;

    /* renamed from: h, reason: collision with root package name */
    public f f32809h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f32810j;

    /* renamed from: k, reason: collision with root package name */
    public long f32811k;
    public int l;

    public k0(UUID uuid, j0 j0Var, HashSet hashSet, i iVar, i iVar2, int i, int i10, f fVar, long j10, i0 i0Var, long j11, int i11) {
        k71.k.g(iVar, "outputData");
        k71.k.g(iVar2, "progress");
        this.f32802a = uuid;
        this.f32803b = j0Var;
        this.f32804c = hashSet;
        this.f32805d = iVar;
        this.f32806e = iVar2;
        this.f32807f = i;
        this.f32808g = i10;
        this.f32809h = fVar;
        this.i = j10;
        this.f32810j = i0Var;
        this.f32811k = j11;
        this.l = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k0.class.equals(obj.getClass())) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f32807f == k0Var.f32807f && this.f32808g == k0Var.f32808g && this.f32802a.equals(k0Var.f32802a) && this.f32803b == k0Var.f32803b && k71.k.b(this.f32805d, k0Var.f32805d) && this.f32809h.equals(k0Var.f32809h) && this.i == k0Var.i && k71.k.b(this.f32810j, k0Var.f32810j) && this.f32811k == k0Var.f32811k && this.l == k0Var.l && this.f32804c.equals(k0Var.f32804c)) {
            return k71.k.b(this.f32806e, k0Var.f32806e);
        }
        return false;
    }

    public final int hashCode() {
        int c10 = x.i.c((this.f32809h.hashCode() + ((((((this.f32806e.hashCode() + ((this.f32804c.hashCode() + ((this.f32805d.hashCode() + ((this.f32803b.hashCode() + (this.f32802a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f32807f) * 31) + this.f32808g) * 31)) * 31, 31, this.i);
        i0 i0Var = this.f32810j;
        return Integer.hashCode(this.l) + x.i.c((c10 + (i0Var != null ? i0Var.hashCode() : 0)) * 31, 31, this.f32811k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f32802a + "', state=" + this.f32803b + ", outputData=" + this.f32805d + ", tags=" + this.f32804c + ", progress=" + this.f32806e + ", runAttemptCount=" + this.f32807f + ", generation=" + this.f32808g + ", constraints=" + this.f32809h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.f32810j + ", nextScheduleTimeMillis=" + this.f32811k + "}, stopReason=" + this.l;
    }

    public Object i;
}
