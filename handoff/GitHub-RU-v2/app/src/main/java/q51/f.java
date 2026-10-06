package q51;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements h {
    public final w21.g a;

    public f(w21.g gVar) {
        this.a = gVar;
    }

    @Override // q51.h
    public final boolean a(r51.a aVar) {
        int i = aVar.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.c(aVar.a);
        return true;
    }

    @Override // q51.h
    public final boolean b(Exception exc) {
        return false;
    }
}
