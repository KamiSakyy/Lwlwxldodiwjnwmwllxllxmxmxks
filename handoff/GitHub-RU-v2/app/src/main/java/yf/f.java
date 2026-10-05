package yf;

import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public interface f {

    public static final class a implements f {
        public final String a;
        public final int b;

        public a(String str, int i) {
            k.g(str, "message");
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.b(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return m0.b(this.b, "Failure(message=", this.a, ", code=", ")");
        }
    }

    public static final class b implements f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1090010425;
        }

        public final String toString() {
            return "Success";
        }
    }
}
