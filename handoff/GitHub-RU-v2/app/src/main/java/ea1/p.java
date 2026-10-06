package ea1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p extends q {
    public final /* synthetic */ int a;
    public Serializable b;

    public p(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = "::".concat(str);
                break;
            default:
                this.b = ba1.a.c(ba1.h.j(str));
                break;
        }
    }

    @Override // ea1.n
    public final int a() {
        switch (this.a) {
            case 0:
                return 6;
            case 1:
                return 1;
            default:
                return 8;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return f1.e.z(":contains(", (String) this.b, ")");
            case 1:
                return (String) this.b;
            default:
                return ":matches(" + ((Pattern) this.b) + ")";
        }
    }

    public p(Pattern pattern) {
        this.a = 2;
        this.b = pattern;
    }
}
