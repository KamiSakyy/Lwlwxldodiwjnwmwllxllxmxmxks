package ca1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends n {
    @Override // ca1.o
    /* renamed from: clone */
    public final Object i() {
        return (e) super.i();
    }

    @Override // ca1.o
    public final o i() {
        return (e) super.i();
    }

    @Override // ca1.o
    public final String s() {
        return "#data";
    }

    @Override // ca1.o
    public final void w(ba1.a aVar, f fVar) {
        String F = F();
        if (fVar.w != 2 || F.contains("<![CDATA[")) {
            aVar.b(F);
            return;
        }
        j jVar = this.r;
        if (jVar != null && jVar.u.t.equals("script")) {
            aVar.b("//<![CDATA[\n").b(F).b("\n//]]>");
            return;
        }
        j jVar2 = this.r;
        if (jVar2 == null || !jVar2.u.t.equals("style")) {
            aVar.b("<![CDATA[").b(F).b("]]>");
        } else {
            aVar.b("/*<![CDATA[*/\n").b(F).b("\n/*]]>*/");
        }
    }
}
