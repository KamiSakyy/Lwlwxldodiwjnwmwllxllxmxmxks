package le;

import a0.s0;
import android.text.SpannableStringBuilder;
import yz0.k2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f28681a;

    /* renamed from: b, reason: collision with root package name */
    public long f28682b;

    public static final class a {
    }

    public static final class b extends k {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return Integer.hashCode(2131954850);
        }

        public final String toString() {
            return "EmptyStateItem(textResId=2131954850)";
        }
    }

    public interface c {
    }

    public static final class d extends k {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return Integer.hashCode(2131952992);
        }

        public final String toString() {
            return "Loading(textResId=2131952992)";
        }
    }

    public static final class e extends k {

        /* renamed from: c, reason: collision with root package name */
        public int f28683c;

        public e(int i) {
            super(3, i);
            this.f28683c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f28683c == ((e) obj).f28683c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f28683c);
        }

        public final String toString() {
            return s0.i("SectionHeaderItem(titleRes=", this.f28683c, ")");
        }
    }

    public static final class f extends k implements c {

        /* renamed from: c, reason: collision with root package name */
        public k2 f28684c;

        /* renamed from: d, reason: collision with root package name */
        public SpannableStringBuilder f28685d;

        public f(k2 k2Var, SpannableStringBuilder spannableStringBuilder) {
            super(2, k2Var.getId().hashCode());
            this.f28684c = k2Var;
            this.f28685d = spannableStringBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k71.k.b(this.f28684c, fVar.f28684c) && k71.k.b(this.f28685d, fVar.f28685d);
        }

        public final int hashCode() {
            return this.f28685d.hashCode() + (this.f28684c.hashCode() * 31);
        }

        public final String toString() {
            return "SelectableLabel(label=" + this.f28684c + ", labelSpan=" + ((Object) this.f28685d) + ")";
        }
    }

    public static final class g extends k implements c {

        /* renamed from: c, reason: collision with root package name */
        public k2 f28686c;

        /* renamed from: d, reason: collision with root package name */
        public SpannableStringBuilder f28687d;

        public g(k2 k2Var, SpannableStringBuilder spannableStringBuilder) {
            super(1, k2Var.getId().hashCode());
            this.f28686c = k2Var;
            this.f28687d = spannableStringBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return k71.k.b(this.f28686c, gVar.f28686c) && k71.k.b(this.f28687d, gVar.f28687d);
        }

        public final int hashCode() {
            return this.f28687d.hashCode() + (this.f28686c.hashCode() * 31);
        }

        public final String toString() {
            return "SelectedLabel(label=" + this.f28686c + ", labelSpan=" + ((Object) this.f28687d) + ")";
        }
    }

    public k(int i, long j10) {
        this.f28681a = i;
        this.f28682b = j10;
    }
}
