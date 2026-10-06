package le;

import a0.s0;
import yz0.v2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f28688a;

    /* renamed from: b, reason: collision with root package name */
    public long f28689b;

    public static final class a {
    }

    public static final class b extends l {

        /* renamed from: c, reason: collision with root package name */
        public int f28690c;

        public b(int i) {
            super(4, i);
            this.f28690c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f28690c == ((b) obj).f28690c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f28690c);
        }

        public final String toString() {
            return s0.i("EmptyStateItem(textResId=", this.f28690c, ")");
        }
    }

    public static final class c extends l {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Loading(textResId=0)";
        }
    }

    public static final class d extends l {

        /* renamed from: c, reason: collision with root package name */
        public int f28691c;

        public d(int i) {
            super(3, i);
            this.f28691c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f28691c == ((d) obj).f28691c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f28691c);
        }

        public final String toString() {
            return s0.i("SectionHeaderItem(titleRes=", this.f28691c, ")");
        }
    }

    public static final class e extends l {

        /* renamed from: c, reason: collision with root package name */
        public v2 f28692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v2 v2Var) {
            super(2, v2Var.getId().hashCode());
            k71.k.g(v2Var, "milestone");
            this.f28692c = v2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.f28692c, ((e) obj).f28692c);
        }

        public final int hashCode() {
            return this.f28692c.hashCode();
        }

        public final String toString() {
            return "SelectableMilestone(milestone=" + this.f28692c + ")";
        }
    }

    public static final class f extends l {

        /* renamed from: c, reason: collision with root package name */
        public v2 f28693c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v2 v2Var) {
            super(1, v2Var.getId().hashCode());
            k71.k.g(v2Var, "milestone");
            this.f28693c = v2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && k71.k.b(this.f28693c, ((f) obj).f28693c);
        }

        public final int hashCode() {
            return this.f28693c.hashCode();
        }

        public final String toString() {
            return "SelectedMilestone(milestone=" + this.f28693c + ")";
        }
    }

    public l(int i, long j10) {
        this.f28688a = i;
        this.f28689b = j10;
    }
}
