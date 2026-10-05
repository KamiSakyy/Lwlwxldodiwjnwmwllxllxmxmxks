package ch;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public interface a {

    /* renamed from: ch.a$a, reason: collision with other inner class name */
    public static final class C0000a implements a {
        public static final C0000a a = new C0000a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0000a);
        }

        public final int hashCode() {
            return 1762602194;
        }

        public final String toString() {
            return "Flat";
        }
    }

    public static final class b implements a {
        public final float a = 4;
        public final float b = 2;
        public final float c = 0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s3.f.b(this.a, bVar.a) && s3.f.b(this.b, bVar.b) && s3.f.b(this.c, bVar.c);
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + x.i.b(Float.hashCode(this.a) * 31, this.b, 31);
        }

        public final String toString() {
            String c = s3.f.c(this.a);
            String c2 = s3.f.c(this.b);
            return h1.p(s0.o("Rounded(cornerRadius=", c, ", horizontalPadding=", c2, ", verticalPadding="), s3.f.c(this.c), ")");
        }
    }
}
