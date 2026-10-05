package he;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j71.a f25598a;

    /* renamed from: b, reason: collision with root package name */
    public final j71.a f25599b;

    /* renamed from: c, reason: collision with root package name */
    public final j71.a f25600c;

    public a(j71.a aVar, j71.a aVar2, j71.a aVar3) {
        k71.k.g(aVar, "onCommentClicked");
        k71.k.g(aVar2, "openInfo");
        k71.k.g(aVar3, "onCopilotBoaClicked");
        this.f25598a = aVar;
        this.f25599b = aVar2;
        this.f25600c = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f25598a, aVar.f25598a) && k71.k.b(this.f25599b, aVar.f25599b) && k71.k.b(this.f25600c, aVar.f25600c);
    }

    public final int hashCode() {
        return this.f25600c.hashCode() + x.i.d(this.f25598a.hashCode() * 31, 31, this.f25599b);
    }

    public final String toString() {
        return "BarOfActionsActions(onCommentClicked=" + this.f25598a + ", openInfo=" + this.f25599b + ", onCopilotBoaClicked=" + this.f25600c + ")";
    }
}
