package le;

import a0.s0;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {
    public static final C0077b Companion = new C0077b();

    /* renamed from: a, reason: collision with root package name */
    public final int f28449a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28450b;

    public interface a {
    }

    /* renamed from: le.b$b, reason: collision with other inner class name */
    public static final class C0077b {
    }

    public static final class c extends b {

        /* renamed from: c, reason: collision with root package name */
        public final int f28451c;

        public c() {
            super(4, Integer.hashCode(2131954848));
            this.f28451c = 2131954848;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f28451c == ((c) obj).f28451c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f28451c);
        }

        public final String toString() {
            return s0.i("EmptyStateItem(textResId=", this.f28451c, ")");
        }
    }

    public static final class d extends b {
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

    public static final class e extends b {

        /* renamed from: c, reason: collision with root package name */
        public final int f28452c;

        public e(int i) {
            super(3, Integer.hashCode(i));
            this.f28452c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f28452c == ((e) obj).f28452c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f28452c);
        }

        public final String toString() {
            return s0.i("SectionHeaderItem(titleRes=", this.f28452c, ")");
        }
    }

    public static final class f extends b implements a {

        /* renamed from: c, reason: collision with root package name */
        public final yz0.f f28453c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(yz0.f fVar) {
            super(2, fVar.getId().hashCode());
            k71.k.g(fVar, "assignee");
            this.f28453c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && k71.k.b(this.f28453c, ((f) obj).f28453c);
        }

        public final int hashCode() {
            return this.f28453c.hashCode();
        }

        public final String toString() {
            return "SelectableAssignee(assignee=" + this.f28453c + ")";
        }
    }

    public static final class g extends b implements a {

        /* renamed from: c, reason: collision with root package name */
        public final yz0.f f28454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(yz0.f fVar) {
            super(1, fVar.getId().hashCode());
            k71.k.g(fVar, "assignee");
            this.f28454c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && k71.k.b(this.f28454c, ((g) obj).f28454c);
        }

        public final int hashCode() {
            return this.f28454c.hashCode();
        }

        public final String toString() {
            return "SelectedAssignee(assignee=" + this.f28454c + ")";
        }
    }

    public b(int i, long j10) {
        this.f28449a = i;
        this.f28450b = j10;
    }
}
