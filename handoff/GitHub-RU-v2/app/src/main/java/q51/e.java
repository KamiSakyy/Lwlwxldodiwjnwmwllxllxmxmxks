package q51;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements h {
    public i a;
    public w21.g b;

    public e(i iVar, w21.g gVar) {
        this.a = iVar;
        this.b = gVar;
    }

    @Override // q51.h
    public final boolean a(r51.a aVar) {
        if (aVar.b != 4 || this.a.a(aVar)) {
            return false;
        }
        String str = aVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.a(new a(str, aVar.e, aVar.f));
        return true;
    }

    @Override // q51.h
    public final boolean b(Exception exc) {
        this.b.b(exc);
        return true;
    }
}
