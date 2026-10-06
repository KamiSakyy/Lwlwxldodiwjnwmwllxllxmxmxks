package le;

import a0.s0;
import com.github.service.models.response.IssueOrPullRequestState;
import yz0.r0;
import yz0.t0;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {
    public static final d Companion = new d();

    /* renamed from: a, reason: collision with root package name */
    public int f28458a;

    /* renamed from: b, reason: collision with root package name */
    public long f28459b;

    public static final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public com.github.service.models.response.a f28460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.github.service.models.response.a aVar) {
            super(2, aVar.x.hashCode());
            k71.k.g(aVar, "author");
            this.f28460c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && k71.k.b(this.f28460c, ((a) obj).f28460c);
        }

        public final int hashCode() {
            return this.f28460c.hashCode();
        }

        public final String toString() {
            return "AuthorItem(author=" + this.f28460c + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        public r0 f28461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0 r0Var) {
            super(4, r0Var.a.hashCode());
            k71.k.g(r0Var, "commit");
            this.f28461c = r0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k71.k.b(this.f28461c, ((b) obj).f28461c);
        }

        public final int hashCode() {
            return this.f28461c.hashCode();
        }

        public final String toString() {
            return "CommitItem(commit=" + this.f28461c + ")";
        }
    }

    /* renamed from: le.c$c, reason: collision with other inner class name */
    public static final class C0078c extends c {

        /* renamed from: c, reason: collision with root package name */
        public String f28462c;

        /* renamed from: d, reason: collision with root package name */
        public String f28463d;

        public C0078c(String str, String str2) {
            super(6, str2.hashCode());
            this.f28462c = str;
            this.f28463d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0078c)) {
                return false;
            }
            C0078c c0078c = (C0078c) obj;
            return k71.k.b(this.f28462c, c0078c.f28462c) && k71.k.b(this.f28463d, c0078c.f28463d);
        }

        public final int hashCode() {
            return this.f28463d.hashCode() + (this.f28462c.hashCode() * 31);
        }

        public final String toString() {
            return x.i.g("CommitOidItem(abbreviatedOid=", qb.b.a(this.f28462c), ", oid=", qb.a.a(this.f28463d), ")");
        }
    }

    public static final class d {
    }

    public static final class e extends c {

        /* renamed from: c, reason: collision with root package name */
        public t0 f28464c;

        /* renamed from: d, reason: collision with root package name */
        public int f28465d;

        /* renamed from: e, reason: collision with root package name */
        public int f28466e;

        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28467a;

            static {
                int[] iArr = new int[IssueOrPullRequestState.values().length];
                try {
                    iArr[IssueOrPullRequestState.PULL_REQUEST_DRAFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IssueOrPullRequestState.PULL_REQUEST_OPEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IssueOrPullRequestState.PULL_REQUEST_CLOSED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IssueOrPullRequestState.PULL_REQUEST_MERGED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f28467a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t0 t0Var) {
            super(3, t0Var.a.hashCode());
            k71.k.g(t0Var, "pullRequest");
            this.f28464c = t0Var;
            if (t0Var.h) {
                this.f28465d = 2131231287;
                this.f28466e = 2131101015;
                return;
            }
            int i = a.f28467a[t0Var.b.ordinal()];
            if (i == 1) {
                this.f28465d = 2131231290;
                this.f28466e = 2131099948;
                return;
            }
            if (i == 2) {
                this.f28465d = 2131231290;
                this.f28466e = 2131100988;
            } else if (i == 3) {
                this.f28465d = 2131231290;
                this.f28466e = 2131100991;
            } else if (i != 4) {
                this.f28465d = 2131231290;
                this.f28466e = 2131099926;
            } else {
                this.f28465d = 2131231285;
                this.f28466e = 2131100990;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.f28464c, ((e) obj).f28464c);
        }

        public final int hashCode() {
            return this.f28464c.hashCode();
        }

        public final String toString() {
            return "PullRequestItem(pullRequest=" + this.f28464c + ")";
        }
    }

    public static final class f extends c {

        /* renamed from: c, reason: collision with root package name */
        public String f28468c;

        public f(String str) {
            super(5, str.hashCode());
            this.f28468c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && k71.k.b(this.f28468c, ((f) obj).f28468c);
        }

        public final int hashCode() {
            return this.f28468c.hashCode();
        }

        public final String toString() {
            return f1.e.z("SectionDividerItem(id=", this.f28468c, ")");
        }
    }

    public static final class g extends c {

        /* renamed from: c, reason: collision with root package name */
        public int f28469c;

        public g(int i) {
            super(1, i);
            this.f28469c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f28469c == ((g) obj).f28469c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f28469c);
        }

        public final String toString() {
            return s0.i("SectionHeaderItem(titleRes=", this.f28469c, ")");
        }
    }

    public c(int i, long j10) {
        this.f28458a = i;
        this.f28459b = j10;
    }
}
