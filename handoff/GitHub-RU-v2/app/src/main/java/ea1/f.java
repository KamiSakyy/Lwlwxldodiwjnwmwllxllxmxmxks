package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends n {
    public final /* synthetic */ int a;
    public String b;

    public /* synthetic */ f(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
    }

    @Override // ea1.n
    public int a() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 8;
            case 3:
            case 4:
            case 6:
            default:
                return super.a();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return f1.e.z("[", this.b, "]");
            case 1:
                return f1.e.z("[^", this.b, "]");
            case 2:
                return f1.e.g(".", this.b);
            case 3:
                return f1.e.z(":containsData(", this.b, ")");
            case 4:
                return f1.e.z(":containsOwn(", this.b, ")");
            case 5:
                return f1.e.z(":contains(", this.b, ")");
            case 6:
                return f1.e.z(":containsWholeOwnText(", this.b, ")");
            case 7:
                return f1.e.z(":containsWholeText(", this.b, ")");
            case 8:
                return f1.e.g("#", this.b);
            case 9:
                return this.b;
            case 10:
                return f1.e.g("*|", this.b);
            default:
                return x.i.f(this.b, "|*");
        }
    }

    public f(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = ba1.a.c(str);
                break;
            case 4:
                this.b = ba1.a.c(ba1.h.j(str));
                break;
            case 5:
                this.b = ba1.a.c(ba1.h.j(str));
                break;
            default:
                aa1.b.K(str);
                this.b = ba1.a.c(str);
                break;
        }
    }
}
