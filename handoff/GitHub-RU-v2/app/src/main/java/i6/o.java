package i6;

/* loaded from: /home/user/work/p/classes.dex */
public final class o implements z5.m {

    /* renamed from: a, reason: collision with root package name */
    public final n f26048a;

    /* renamed from: b, reason: collision with root package name */
    public final n f26049b;

    /* renamed from: c, reason: collision with root package name */
    public final n f26050c;

    /* renamed from: d, reason: collision with root package name */
    public final n f26051d;

    /* renamed from: e, reason: collision with root package name */
    public final n f26052e;

    /* renamed from: f, reason: collision with root package name */
    public final n f26053f;

    public o(n nVar, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6) {
        this.f26048a = nVar;
        this.f26049b = nVar2;
        this.f26050c = nVar3;
        this.f26051d = nVar4;
        this.f26052e = nVar5;
        this.f26053f = nVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.f26048a, oVar.f26048a) && k71.k.b(this.f26049b, oVar.f26049b) && k71.k.b(this.f26050c, oVar.f26050c) && k71.k.b(this.f26051d, oVar.f26051d) && k71.k.b(this.f26052e, oVar.f26052e) && k71.k.b(this.f26053f, oVar.f26053f);
    }

    public final int hashCode() {
        return this.f26053f.hashCode() + ((this.f26052e.hashCode() + ((this.f26051d.hashCode() + ((this.f26050c.hashCode() + ((this.f26049b.hashCode() + (this.f26048a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f26048a + ", start=" + this.f26049b + ", top=" + this.f26050c + ", right=" + this.f26051d + ", end=" + this.f26052e + ", bottom=" + this.f26053f + ')';
    }

    public /* synthetic */ o(n nVar, n nVar2, n nVar3, n nVar4) {
        this(new n(3, 0.0f), nVar, nVar2, new n(3, 0.0f), nVar3, nVar4);
    }
}
