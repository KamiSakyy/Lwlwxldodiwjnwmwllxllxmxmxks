package com.github.rudroid.copilot;

/* loaded from: /home/user/work/p/classes.dex */
public interface u4 {

    public static final class a implements u4 {

        /* renamed from: a, reason: collision with root package name */
        public f5 f10061a;

        /* renamed from: b, reason: collision with root package name */
        public xn.b1 f10062b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10063c;

        public a(f5 f5Var, xn.b1 b1Var, boolean z10) {
            k71.k.g(b1Var, "model");
            this.f10061a = f5Var;
            this.f10062b = b1Var;
            this.f10063c = z10;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10061a.equals(aVar.f10061a) && k71.k.b(this.f10062b, aVar.f10062b) && this.f10063c == aVar.f10063c;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + x.i.e((this.f10062b.hashCode() + (this.f10061a.hashCode() * 31)) * 31, 31, this.f10063c);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AcceptPolicyBannerModel(termsText=");
            sb2.append(this.f10061a);
            sb2.append(", model=");
            sb2.append(this.f10062b);
            sb2.append(", isLoading=");
            return jo.f4.s(sb2, this.f10063c, ", shouldHideUserTextInput=true)");
        }
    }

    public static final class b implements u4, b5 {

        /* renamed from: a, reason: collision with root package name */
        public double f10064a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10065b;

        public b(double d10, boolean z10) {
            this.f10064a = d10;
            this.f10065b = z10;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f10064a, bVar.f10064a) == 0 && this.f10065b == bVar.f10065b;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + x.i.e(Double.hashCode(this.f10064a) * 31, 31, this.f10065b);
        }

        public final String toString() {
            return "CopilotFreeApproachingRateLimitBannerModel(amountPercentage=" + this.f10064a + ", showUpgradeOption=" + this.f10065b + ", shouldHideUserTextInput=false)";
        }
    }

    public static final class c implements u4 {

        /* renamed from: a, reason: collision with root package name */
        public String f10066a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10067b;

        public c(String str, boolean z10) {
            this.f10066a = str;
            this.f10067b = z10;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f10066a, cVar.f10066a) && this.f10067b == cVar.f10067b;
        }

        public final int hashCode() {
            String str = this.f10066a;
            return Boolean.hashCode(true) + x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f10067b);
        }

        public final String toString() {
            return h1.n("CopilotFreeMessageRateLimitBannerModel(resetDate=", this.f10066a, ", showUpgradeOption=", ", shouldHideUserTextInput=true)", this.f10067b);
        }
    }

    public static final class d implements u4, b5 {

        /* renamed from: a, reason: collision with root package name */
        public double f10068a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10069b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10070c;

        public d(double d10, boolean z10, boolean z11) {
            this.f10068a = d10;
            this.f10069b = z10;
            this.f10070c = z11;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Double.compare(this.f10068a, dVar.f10068a) == 0 && this.f10069b == dVar.f10069b && this.f10070c == dVar.f10070c;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + x.i.e(x.i.e(Double.hashCode(this.f10068a) * 31, 31, this.f10069b), 31, this.f10070c);
        }

        public final String toString() {
            return "CopilotPaidApproachingRateLimitBannerModel(amountPercentage=" + this.f10068a + ", overagesEnabled=" + this.f10069b + ", showUpgradeOption=" + this.f10070c + ", shouldHideUserTextInput=false)";
        }
    }

    public static final class e implements u4 {

        /* renamed from: a, reason: collision with root package name */
        public String f10071a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10072b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10073c;

        public e(String str, boolean z10, boolean z11) {
            this.f10071a = str;
            this.f10072b = z10;
            this.f10073c = z11;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k71.k.b(this.f10071a, eVar.f10071a) && this.f10072b == eVar.f10072b && this.f10073c == eVar.f10073c;
        }

        public final int hashCode() {
            String str = this.f10071a;
            return Boolean.hashCode(true) + x.i.e(x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f10072b), 31, this.f10073c);
        }

        public final String toString() {
            return jo.f4.s(com.github.rudroid.m0.o("CopilotPaidExceededOverageQuotaBannerModel(resetDate=", this.f10071a, ", showUpgradeOption=", ", showFallbackModelOption=", this.f10072b), this.f10073c, ", shouldHideUserTextInput=true)");
        }
    }

    public static final class f implements u4 {

        /* renamed from: a, reason: collision with root package name */
        public String f10074a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10075b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10076c;

        public f(String str, boolean z10, boolean z11) {
            this.f10074a = str;
            this.f10075b = z10;
            this.f10076c = z11;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k71.k.b(this.f10074a, fVar.f10074a) && this.f10075b == fVar.f10075b && this.f10076c == fVar.f10076c;
        }

        public final int hashCode() {
            String str = this.f10074a;
            return Boolean.hashCode(true) + x.i.e(x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f10075b), 31, this.f10076c);
        }

        public final String toString() {
            return jo.f4.s(com.github.rudroid.m0.o("CopilotPaidReachedRateLimitBannerModel(resetDate=", this.f10074a, ", showUpgradeOption=", ", showFallbackModelOption=", this.f10075b), this.f10076c, ", shouldHideUserTextInput=true)");
        }
    }

    public static final class g implements u4, b5 {

        /* renamed from: a, reason: collision with root package name */
        public String f10077a;

        public g(String str) {
            this.f10077a = str;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && k71.k.b(this.f10077a, ((g) obj).f10077a);
        }

        public final int hashCode() {
            String str = this.f10077a;
            return Boolean.hashCode(false) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return f1.e.z("CopilotPaidReachedRateLimitOveragesBannerModel(resetDate=", this.f10077a, ", shouldHideUserTextInput=false)");
        }
    }

    public static final class h implements u4 {

        /* renamed from: a, reason: collision with root package name */
        public xn.b1 f10078a;

        public h(xn.b1 b1Var) {
            this.f10078a = b1Var;
        }

        @Override // com.github.rudroid.copilot.u4
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f10078a.equals(((h) obj).f10078a);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.f10078a.hashCode() * 31);
        }

        public final String toString() {
            return "NewConversationDialogBannerModel(model=" + this.f10078a + ", shouldHideUserTextInput=true)";
        }
    }

    boolean a();
}
