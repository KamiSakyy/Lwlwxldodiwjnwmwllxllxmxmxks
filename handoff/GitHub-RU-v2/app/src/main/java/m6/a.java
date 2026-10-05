package m6;

import x.i;
import z5.h;
import z5.l;
import z5.n;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public e f28928b;

    /* renamed from: a, reason: collision with root package name */
    public String f28927a = "";

    /* renamed from: c, reason: collision with root package name */
    public int f28929c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public n f28930d = l.f34585a;

    @Override // z5.h
    public final h a() {
        a aVar = new a();
        aVar.f28930d = this.f28930d;
        aVar.f28927a = this.f28927a;
        aVar.f28928b = this.f28928b;
        aVar.f28929c = this.f28929c;
        return aVar;
    }

    @Override // z5.h
    public final void b(n nVar) {
        this.f28930d = nVar;
    }

    @Override // z5.h
    public final n c() {
        return this.f28930d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmittableText(");
        sb2.append(this.f28927a);
        sb2.append(", style=");
        sb2.append(this.f28928b);
        sb2.append(", modifier=");
        sb2.append(this.f28930d);
        sb2.append(", maxLines=");
        return i.j(sb2, this.f28929c, ')');
    }
}
