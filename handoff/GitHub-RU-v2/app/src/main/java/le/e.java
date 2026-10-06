package le;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.type.RepositoryRecommendationReason;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e implements z {
    public static final a Companion = new a();

    /* renamed from: r, reason: collision with root package name */
    public String f28470r;

    public static final class a {
    }

    public static final class b extends e {
    }

    public static final class c extends e {
        public int A;
        public TrendingPeriod B;
        public String C;
        public int D;
        public RepositoryRecommendationReason E;
        public String F;
        public List G;

        /* renamed from: s, reason: collision with root package name */
        public String f28471s;

        /* renamed from: t, reason: collision with root package name */
        public String f28472t;

        /* renamed from: u, reason: collision with root package name */
        public com.github.service.models.response.a f28473u;

        /* renamed from: v, reason: collision with root package name */
        public int f28474v;

        /* renamed from: w, reason: collision with root package name */
        public String f28475w;

        /* renamed from: x, reason: collision with root package name */
        public String f28476x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f28477y;

        /* renamed from: z, reason: collision with root package name */
        public int f28478z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, com.github.service.models.response.a aVar, int i, String str3, String str4, boolean z10, int i10, int i11, TrendingPeriod trendingPeriod, String str5, int i12, RepositoryRecommendationReason repositoryRecommendationReason, String str6, List list) {
            super("ITEM_TYPE_RECOMMENDED_REPOSITORY".concat(str), 3);
            k71.k.g(str, "id");
            k71.k.g(str2, "name");
            k71.k.g(aVar, "owner");
            k71.k.g(str4, "shortDescriptionHtml");
            k71.k.g(repositoryRecommendationReason, "reason");
            k71.k.g(str6, "url");
            k71.k.g(list, "listNames");
            this.f28471s = str;
            this.f28472t = str2;
            this.f28473u = aVar;
            this.f28474v = i;
            this.f28475w = str3;
            this.f28476x = str4;
            this.f28477y = z10;
            this.f28478z = i10;
            this.A = i11;
            this.B = trendingPeriod;
            this.C = str5;
            this.D = i12;
            this.E = repositoryRecommendationReason;
            this.F = str6;
            this.G = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f28471s, cVar.f28471s) && k71.k.b(this.f28472t, cVar.f28472t) && k71.k.b(this.f28473u, cVar.f28473u) && this.f28474v == cVar.f28474v && k71.k.b(this.f28475w, cVar.f28475w) && k71.k.b(this.f28476x, cVar.f28476x) && this.f28477y == cVar.f28477y && this.f28478z == cVar.f28478z && this.A == cVar.A && this.B == cVar.B && k71.k.b(this.C, cVar.C) && this.D == cVar.D && this.E == cVar.E && k71.k.b(this.F, cVar.F) && k71.k.b(this.G, cVar.G);
        }

        public final int hashCode() {
            int b10 = s0.b(this.f28474v, f4.b(this.f28473u, h1.i(this.f28471s.hashCode() * 31, this.f28472t, 31), 31), 31);
            String str = this.f28475w;
            int b11 = s0.b(this.A, s0.b(this.f28478z, x.i.e(h1.i((b10 + (str == null ? 0 : str.hashCode())) * 31, this.f28476x, 31), 31, this.f28477y), 31), 31);
            TrendingPeriod trendingPeriod = this.B;
            int hashCode = (b11 + (trendingPeriod == null ? 0 : trendingPeriod.hashCode())) * 31;
            String str2 = this.C;
            return this.G.hashCode() + h1.i((this.E.hashCode() + s0.b(this.D, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31, this.F, 31);
        }

        public final String toString() {
            StringBuilder o5 = s0.o("ExploreRepositoryItem(id=", this.f28471s, ", name=", this.f28472t, ", owner=");
            o5.append(this.f28473u);
            o5.append(", languageColor=");
            o5.append(this.f28474v);
            o5.append(", languageName=");
            f1.e.x(o5, this.f28475w, ", shortDescriptionHtml=", this.f28476x, ", isStarred=");
            m0.y(o5, this.f28477y, ", starCount=", this.f28478z, ", starsSinceCount=");
            o5.append(this.A);
            o5.append(", trendingPeriod=");
            o5.append(this.B);
            o5.append(", coverImageUrl=");
            s0.w(this.D, this.C, ", contributorsCount=", ", reason=", o5);
            o5.append(this.E);
            o5.append(", url=");
            o5.append(this.F);
            o5.append(", listNames=");
            return x.i.l(o5, this.G, ")");
        }
    }

    public static final class d extends e {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SectionDividerItem(id=null, visible=false)";
        }
    }

    /* renamed from: le.e$e, reason: collision with other inner class name */
    public static final class C0079e extends e {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0079e);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Integer.hashCode(0) * 31);
        }

        public final String toString() {
            return "SectionHeaderItem(titleRes=0, isEditable=false)";
        }
    }

    public e(String str, int i) {
        this.f28470r = str;
    }

    @Override // le.z
    public final String E() {
        return this.f28470r;
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
