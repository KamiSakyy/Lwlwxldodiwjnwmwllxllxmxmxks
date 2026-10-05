package aa;

import java.util.List;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f625a;

    /* renamed from: b, reason: collision with root package name */
    public UUID f626b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f627c;

    /* renamed from: d, reason: collision with root package name */
    public ba.f f628d;

    /* renamed from: e, reason: collision with root package name */
    public List f629e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f630f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f631g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f632h;
    public Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f633j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f634k;

    public d(s0 s0Var, UUID uuid, g0 g0Var, ba.f fVar, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, boolean z10) {
        this.f625a = s0Var;
        this.f626b = uuid;
        this.f627c = g0Var;
        this.f628d = fVar;
        this.f629e = list;
        this.f630f = bool;
        this.f631g = bool2;
        this.f632h = bool3;
        this.i = bool4;
        this.f633j = bool5;
        this.f634k = z10;
    }

    public void a(String str, String str2) {
        k71.k.g(str2, "value");
        x61.r rVar = this.f629e;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        this.f629e = x61.m.m0(rVar, new ba.e(str, str2));
    }

    public d b() {
        UUID uuid = this.f626b;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            k71.k.f(uuid, "randomUUID(...)");
        }
        return new d(this.f625a, uuid, this.f627c, this.f628d, this.f629e, this.f631g, this.f632h, this.f630f, this.i, this.f633j, this.f634k);
    }

    @Override // aa.l0
    public Object c(e0 e0Var) {
        this.f627c = this.f627c.d(e0Var);
        return this;
    }

    public d d() {
        s0 s0Var = this.f625a;
        k71.k.g(s0Var, "operation");
        d dVar = new d(s0Var);
        dVar.f626b = this.f626b;
        g0 g0Var = this.f627c;
        k71.k.g(g0Var, "executionContext");
        dVar.f627c = g0Var;
        dVar.f628d = this.f628d;
        dVar.f629e = this.f629e;
        dVar.f631g = this.f630f;
        dVar.f632h = this.f631g;
        dVar.f630f = this.f632h;
        dVar.i = this.i;
        dVar.f633j = this.f633j;
        dVar.f634k = this.f634k;
        return dVar;
    }

    public d(s0 s0Var) {
        k71.k.g(s0Var, "operation");
        this.f625a = s0Var;
        this.f627c = z.f692a;
        this.f634k = true;
    }
}
