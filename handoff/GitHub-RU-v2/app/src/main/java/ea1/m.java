package ea1;

import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m extends n {
    public final /* synthetic */ int a;
    public final Pattern b;

    public /* synthetic */ m(Pattern pattern, int i) {
        this.a = i;
        this.b = pattern;
    }

    @Override // ea1.n
    public final int a() {
        switch (this.a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":matches(" + this.b + ")";
            case 1:
                return ":matchesOwn(" + this.b + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.b + ")";
            default:
                return ":matchesWholeText(" + this.b + ")";
        }
    }
}
