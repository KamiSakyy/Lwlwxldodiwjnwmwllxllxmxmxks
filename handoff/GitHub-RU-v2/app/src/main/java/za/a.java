package za;

import k71.k;
import q71.g;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0097a f34649a;

    /* renamed from: b, reason: collision with root package name */
    public d f34650b = new d();

    /* renamed from: za.a$a, reason: collision with other inner class name */
    public interface InterfaceC0097a {
        boolean a(g gVar);
    }

    public a(InterfaceC0097a interfaceC0097a) {
        this.f34649a = interfaceC0097a;
    }

    @Override // za.c
    public final g e() {
        return this.f34650b.f34652b;
    }

    @Override // za.c
    public final g f() {
        g gVar = this.f34650b.f34652b;
        this.f34650b = new d();
        return new g(gVar.f30996r, gVar.f30997s, 1);
    }

    @Override // za.c
    public final g g(String str, int i) {
        g gVar;
        g gVar2;
        k.g(str, "path");
        if (this.f34650b.f34652b.isEmpty()) {
            this.f34650b = new d(i, str, i);
            return new g(i, i, 1);
        }
        if (!k.b(this.f34650b.f34651a, str)) {
            return g.f31003u;
        }
        d dVar = this.f34650b;
        g gVar3 = dVar.f34652b;
        if (i == gVar3.f30996r && i == gVar3.f30997s) {
            gVar2 = g.f31003u;
        } else {
            if (gVar3.isEmpty()) {
                gVar = new g(i, i, 1);
            } else {
                gVar = dVar.f34652b;
                int i10 = gVar.f30996r;
                if (i == i10) {
                    g gVar4 = dVar.f34652b;
                    gVar2 = new g(gVar4.f30996r + 1, gVar4.f30997s, 1);
                } else {
                    int i11 = gVar.f30997s;
                    if (i == i11) {
                        g gVar5 = dVar.f34652b;
                        gVar2 = new g(gVar5.f30996r, gVar5.f30997s - 1, 1);
                    } else if (i < i10) {
                        gVar = new g(i, dVar.f34652b.f30997s, 1);
                    } else if (i > i11) {
                        gVar = new g(dVar.f34652b.f30996r, i, 1);
                    }
                }
            }
            gVar2 = gVar;
        }
        dVar.f34652b = gVar2;
        g gVar6 = this.f34650b.f34652b;
        if (k.b(gVar3, gVar6)) {
            return g.f31003u;
        }
        InterfaceC0097a interfaceC0097a = this.f34649a;
        if (interfaceC0097a != null && interfaceC0097a.a(gVar6)) {
            this.f34650b = new d(gVar3.f30996r, str, gVar3.f30997s);
            return g.f31003u;
        }
        int i12 = gVar3.f30997s;
        int i13 = gVar3.f30996r;
        int i14 = gVar6.f30997s;
        int i15 = gVar6.f30996r;
        return Math.abs(i12 - i14) > 0 ? i12 < i14 ? new g(i12 + 1, i14, 1) : new g(i12, i12, 1) : i13 < i15 ? new g(i13, i13, 1) : new g(i15, i13 - 1, 1);
    }

    @Override // za.c
    public final boolean h(int i) {
        return this.f34650b.f34652b.a(i);
    }

    @Override // za.c
    public final g setSelection(int i, int i10) {
        this.f34650b = new d(i, "", i10);
        return new g(i, i10, 1);
    }
}
