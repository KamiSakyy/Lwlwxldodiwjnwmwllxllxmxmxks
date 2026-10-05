package ca1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h extends n {
    public final boolean H(String str) {
        return !ba1.h.e(b(str));
    }

    @Override // ca1.o
    public final String s() {
        return "#doctype";
    }

    @Override // ca1.o
    public final void w(ba1.a aVar, f fVar) {
        if (fVar.w != 1 || H("publicId") || H("systemId")) {
            aVar.b("<!DOCTYPE");
        } else {
            aVar.b("<!doctype");
        }
        if (H("name")) {
            aVar.b(" ").b(b("name"));
        }
        if (H("pubSysKey")) {
            aVar.b(" ").b(b("pubSysKey"));
        }
        if (H("publicId")) {
            aVar.b(" \"").b(b("publicId")).a('\"');
        }
        if (H("systemId")) {
            aVar.b(" \"").b(b("systemId")).a('\"');
        }
        aVar.a('>');
    }
}
