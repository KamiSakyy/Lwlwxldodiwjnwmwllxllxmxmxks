package ae;

import com.github.service.models.response.type.PullRequestMergeMethod;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f865a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f866b;

    /* renamed from: c, reason: collision with root package name */
    public final ae.a f867c;

    public static final class a extends c {

        /* renamed from: d, reason: collision with root package name */
        public final PullRequestMergeMethod f868d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f869e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PullRequestMergeMethod pullRequestMergeMethod, boolean z10) {
            super(!z10, (ae.a) null, 6);
            k.g(pullRequestMergeMethod, "method");
            this.f868d = pullRequestMergeMethod;
            this.f869e = z10;
        }
    }

    public static final class b extends c {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f870d;

        public b(boolean z10) {
            super(false, (ae.a) null, 4);
            this.f870d = z10;
        }
    }

    /* renamed from: ae.c$c, reason: collision with other inner class name */
    public static final class C0004c extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final C0004c f871d = new C0004c(false, null, 7);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0004c);
        }

        public final int hashCode() {
            return 1123435934;
        }

        public final String toString() {
            return "MarkReadyForReview";
        }
    }

    public static final class d extends c {

        /* renamed from: d, reason: collision with root package name */
        public final PullRequestMergeMethod f872d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PullRequestMergeMethod pullRequestMergeMethod, ae.a aVar) {
            super(true, aVar, 2);
            k.g(pullRequestMergeMethod, "method");
            this.f872d = pullRequestMergeMethod;
        }
    }

    public static final class e extends c {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f873d;

        /* renamed from: e, reason: collision with root package name */
        public final int f874e;

        /* renamed from: f, reason: collision with root package name */
        public final ae.d f875f;

        /* renamed from: g, reason: collision with root package name */
        public final Integer f876g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ae.a aVar, boolean z10, int i, ae.d dVar, String str, Integer num) {
            super(false, true, aVar);
            k.g(dVar, "selectedOption");
            this.f873d = z10;
            this.f874e = i;
            this.f875f = dVar;
            this.f876g = num;
        }
    }

    public static final class f extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final f f877d = new f(false, null, 7);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1677190824;
        }

        public final String toString() {
            return "RecheckMergeStatus";
        }
    }

    public c(boolean z10, boolean z11, ae.a aVar) {
        this.f865a = z10;
        this.f866b = z11;
        this.f867c = aVar;
    }

    public /* synthetic */ c(boolean z10, ae.a aVar, int i) {
        this((i & 1) != 0 ? false : z10, (i & 2) == 0, (i & 4) != 0 ? ae.a.f855s : aVar);
    }
}
