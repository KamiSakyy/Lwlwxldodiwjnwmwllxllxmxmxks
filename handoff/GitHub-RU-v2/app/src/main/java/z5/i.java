package z5;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public a f34578b;

    /* renamed from: c, reason: collision with root package name */
    public q f34579c;

    /* renamed from: d, reason: collision with root package name */
    public Float f34580d;

    /* renamed from: a, reason: collision with root package name */
    public n f34577a = l.f34585a;

    /* renamed from: e, reason: collision with root package name */
    public int f34581e = 1;

    @Override // z5.h
    public final h a() {
        i iVar = new i();
        iVar.f34577a = this.f34577a;
        iVar.f34578b = this.f34578b;
        iVar.f34579c = this.f34579c;
        iVar.f34580d = this.f34580d;
        iVar.f34581e = this.f34581e;
        return iVar;
    }

    @Override // z5.h
    public final void b(n nVar) {
        this.f34577a = nVar;
    }

    @Override // z5.h
    public final n c() {
        return this.f34577a;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f34577a + ", provider=" + this.f34578b + ", colorFilterParams=" + this.f34579c + ", alpha=" + this.f34580d + ", contentScale=" + ((Object) i6.h.a(this.f34581e)) + ')';
    }
    public Object k(Object p1) { return null; }
    public Object k(Object p1) { return null; }
}
