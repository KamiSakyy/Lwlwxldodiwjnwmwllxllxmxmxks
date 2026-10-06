package com.github.rudroid.profile;

import a0.s0;
import com.github.rudroid.adapters.viewholders.w;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import java.util.ArrayList;
import java.util.List;
import jo.f4;
import kotlin.NoWhenBranchMatchedException;
import yz0.o8;
import yz0.p8;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class d {
    public static final a Companion = new a();

    public static final class a {
    }

    public static final class b extends d {
        public int A;
        public int B;
        public boolean C;
        public boolean D;
        public boolean E;
        public boolean F;
        public String G;
        public boolean H;
        public boolean I;
        public boolean J;
        public boolean K;
        public String L;
        public List M;
        public List N;
        public String O;
        public boolean P;
        public boolean Q;
        public boolean R;

        /* renamed from: r, reason: collision with root package name */
        public Avatar f17256r;

        /* renamed from: s, reason: collision with root package name */
        public String f17257s;

        /* renamed from: t, reason: collision with root package name */
        public String f17258t;

        /* renamed from: u, reason: collision with root package name */
        public String f17259u;

        /* renamed from: v, reason: collision with root package name */
        public String f17260v;

        /* renamed from: w, reason: collision with root package name */
        public String f17261w;

        /* renamed from: x, reason: collision with root package name */
        public String f17262x;

        /* renamed from: y, reason: collision with root package name */
        public o8 f17263y;

        /* renamed from: z, reason: collision with root package name */
        public String f17264z;

        public b(Avatar avatar, String str, String str2, String str3, String str4, String str5, String str6, o8 o8Var, String str7, int i, int i10, boolean z10, boolean z11, boolean z12, boolean z13, String str8, boolean z14, boolean z15, boolean z16, boolean z17, String str9, List list, List list2, String str10, boolean z18, boolean z19, boolean z20) {
            k71.k.g(str2, "login");
            k71.k.g(str8, "userId");
            this.f17256r = avatar;
            this.f17257s = str;
            this.f17258t = str2;
            this.f17259u = str3;
            this.f17260v = str4;
            this.f17261w = str5;
            this.f17262x = str6;
            this.f17263y = o8Var;
            this.f17264z = str7;
            this.A = i;
            this.B = i10;
            this.C = z10;
            this.D = z11;
            this.E = z12;
            this.F = z13;
            this.G = str8;
            this.H = z14;
            this.I = z15;
            this.J = z16;
            this.K = z17;
            this.L = str9;
            this.M = list;
            this.N = list2;
            this.O = str10;
            this.P = z18;
            this.Q = z19;
            this.R = z20;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17256r.equals(bVar.f17256r) && this.f17257s.equals(bVar.f17257s) && k71.k.b(this.f17258t, bVar.f17258t) && this.f17259u.equals(bVar.f17259u) && this.f17260v.equals(bVar.f17260v) && this.f17261w.equals(bVar.f17261w) && k71.k.b(this.f17262x, bVar.f17262x) && k71.k.b(this.f17263y, bVar.f17263y) && k71.k.b(this.f17264z, bVar.f17264z) && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F && k71.k.b(this.G, bVar.G) && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && this.K == bVar.K && this.L.equals(bVar.L) && this.M.equals(bVar.M) && this.N.equals(bVar.N) && this.O.equals(bVar.O) && this.P == bVar.P && this.Q == bVar.Q && this.R == bVar.R;
        }

        public final int hashCode() {
            int i = h1.i(h1.i(h1.i(h1.i(h1.i(this.f17256r.hashCode() * 31, this.f17257s, 31), this.f17258t, 31), this.f17259u, 31), this.f17260v, 31), this.f17261w, 31);
            String str = this.f17262x;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            o8 o8Var = this.f17263y;
            int hashCode2 = (hashCode + (o8Var == null ? 0 : o8Var.hashCode())) * 31;
            String str2 = this.f17264z;
            return Boolean.hashCode(this.R) + x.i.e(x.i.e(h1.i(f1.e.c(this.N, f1.e.c(this.M, h1.i(x.i.e(x.i.e(x.i.e(x.i.e(h1.i(x.i.e(x.i.e(x.i.e(x.i.e(s0.b(this.B, s0.b(this.A, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31, this.C), 31, this.D), 31, this.E), 31, this.F), this.G, 31), 31, this.H), 31, this.I), 31, this.J), 31, this.K), this.L, 31), 31), 31), this.O, 31), 31, this.P), 31, this.Q);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfileHeaderItem(avatar=");
            sb2.append(this.f17256r);
            sb2.append(", name=");
            sb2.append(this.f17257s);
            sb2.append(", login=");
            f1.e.x(sb2, this.f17258t, ", email=", this.f17259u, ", websiteUrl=");
            f1.e.x(sb2, this.f17260v, ", bioHtml=", this.f17261w, ", companyHtml=");
            sb2.append(this.f17262x);
            sb2.append(", status=");
            sb2.append(this.f17263y);
            sb2.append(", location=");
            s0.w(this.A, this.f17264z, ", followersCount=", ", followingCount=", sb2);
            com.github.rudroid.m0.w(sb2, this.B, ", isFollowing=", this.C, ", showFollowButton=");
            com.github.rudroid.m0.A(sb2, this.D, ", showFollowCounts=", this.E, ", showUnblockButton=");
            com.github.rudroid.m0.z(sb2, this.F, ", userId=", this.G, ", isVerified=");
            com.github.rudroid.m0.A(sb2, this.H, ", isDevProgramMember=", this.I, ", isBountyHunter=");
            com.github.rudroid.m0.A(sb2, this.J, ", isOrganization=", this.K, ", xUsername=");
            sb2.append(this.L);
            sb2.append(", socialLinks=");
            sb2.append(this.M);
            sb2.append(", achievementBadges=");
            sb2.append(this.N);
            sb2.append(", pronouns=");
            sb2.append(this.O);
            sb2.append(", multiAccountAvailable=");
            com.github.rudroid.m0.A(sb2, this.P, ", isViewer=", this.Q, ", hasOrganizations=");
            return f4.s(sb2, this.R, ")");
        }
    }

    public static final class c extends d {
    }

    /* renamed from: com.github.rudroid.profile.d$d, reason: collision with other inner class name */
    public static final class C0052d extends d {

        /* renamed from: r, reason: collision with root package name */
        public p8 f17265r;

        /* renamed from: s, reason: collision with root package name */
        public int f17266s;

        /* renamed from: t, reason: collision with root package name */
        public int f17267t;

        /* renamed from: u, reason: collision with root package name */
        public a f17268u;

        /* renamed from: v, reason: collision with root package name */
        public int f17269v;

        /* renamed from: w, reason: collision with root package name */
        public int f17270w;

        /* renamed from: x, reason: collision with root package name */
        public int f17271x;

        /* renamed from: y, reason: collision with root package name */
        public int f17272y;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.github.rudroid.profile.d$d$a */
        public static final class a {

            /* renamed from: r, reason: collision with root package name */
            public static final a f17273r;

            /* renamed from: s, reason: collision with root package name */
            public static final a f17274s;

            /* renamed from: t, reason: collision with root package name */
            public static final a f17275t;

            /* renamed from: u, reason: collision with root package name */
            public static final a f17276u;

            /* renamed from: v, reason: collision with root package name */
            public static final a f17277v;

            /* renamed from: w, reason: collision with root package name */
            public static final a f17278w;

            /* renamed from: x, reason: collision with root package name */
            public static final /* synthetic */ a[] f17279x;

            static {
                a aVar = new a("REPOSITORIES", 0);
                f17273r = aVar;
                a aVar2 = new a("ORGANIZATIONS", 1);
                f17274s = aVar2;
                a aVar3 = new a("STARRED_REPOSITORIES", 2);
                f17275t = aVar3;
                a aVar4 = new a("SPONSORING", 3);
                f17276u = aVar4;
                a aVar5 = new a("PROJECTS", 4);
                f17277v = aVar5;
                a aVar6 = new a("DISCUSSIONS", 5);
                f17278w = aVar6;
                a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
                f17279x = aVarArr;
                v8.l0.t(aVarArr);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f17279x.clone();
            }
        }

        /* renamed from: com.github.rudroid.profile.d$d$b */
        public static final /* synthetic */ class b {
            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    a aVar = a.f17273r;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    a aVar2 = a.f17273r;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    a aVar3 = a.f17273r;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    a aVar4 = a.f17273r;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    a aVar5 = a.f17273r;
                    iArr[5] = 6;
                } catch (NoSuchFieldError unused6) {
                }
            }
        }

        public C0052d(p8 p8Var, int i, int i10, a aVar, int i11, int i12) {
            int i13;
            int i14;
            k71.k.g(p8Var, "profile");
            aVar.hashCode();
            this.f17265r = p8Var;
            this.f17266s = i;
            this.f17267t = i10;
            this.f17268u = aVar;
            this.f17269v = i11;
            this.f17270w = i12;
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                i13 = 2131954189;
            } else if (ordinal == 1) {
                i13 = 2131954185;
            } else if (ordinal == 2) {
                i13 = 2131954191;
            } else if (ordinal == 3) {
                i13 = 2131954190;
            } else if (ordinal == 4) {
                i13 = 2131954187;
            } else {
                if (ordinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 2131954181;
            }
            this.f17271x = i13;
            int ordinal2 = aVar.ordinal();
            if (ordinal2 == 0) {
                i14 = 2131820637;
            } else if (ordinal2 == 1) {
                i14 = 2131820635;
            } else if (ordinal2 == 2) {
                i14 = 2131820639;
            } else if (ordinal2 == 3) {
                i14 = 2131820638;
            } else if (ordinal2 == 4) {
                i14 = 2131820636;
            } else {
                if (ordinal2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = 2131820634;
            }
            this.f17272y = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0052d)) {
                return false;
            }
            C0052d c0052d = (C0052d) obj;
            return k71.k.b(this.f17265r, c0052d.f17265r) && this.f17266s == c0052d.f17266s && this.f17267t == c0052d.f17267t && this.f17268u == c0052d.f17268u && this.f17269v == c0052d.f17269v && this.f17270w == c0052d.f17270w;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f17270w) + s0.b(this.f17269v, (this.f17268u.hashCode() + s0.b(this.f17267t, s0.b(this.f17266s, this.f17265r.hashCode() * 31, 31), 31)) * 31, 31);
        }

        public final String toString() {
            return "ProfileMenuButtonItem(profile=" + this.f17265r + ", text=" + this.f17266s + ", value=" + this.f17267t + ", type=" + this.f17268u + ", iconResId=" + this.f17269v + ", backgroundTintId=" + this.f17270w + ")";
        }
    }

    public static final class e extends d {

        /* renamed from: r, reason: collision with root package name */
        public ArrayList f17280r;

        /* renamed from: s, reason: collision with root package name */
        public int f17281s;

        /* renamed from: t, reason: collision with root package name */
        public int f17282t;

        public e(ArrayList arrayList, int i, int i10) {
            this.f17280r = arrayList;
            this.f17281s = i;
            this.f17282t = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f17280r.equals(eVar.f17280r) && this.f17281s == eVar.f17281s && this.f17282t == eVar.f17282t;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f17282t) + s0.b(this.f17281s, this.f17280r.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfilePinnedListItem(pinnedItems=");
            sb2.append(this.f17280r);
            sb2.append(", title=");
            sb2.append(this.f17281s);
            sb2.append(", icon=");
            return s0.l(sb2, this.f17282t, ")");
        }
    }

    public static final class f extends d implements w.a {

        /* renamed from: r, reason: collision with root package name */
        public zh.c f17283r;

        /* renamed from: s, reason: collision with root package name */
        public String f17284s;

        /* renamed from: t, reason: collision with root package name */
        public String f17285t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f17286u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f17287v;

        public f(zh.c cVar, String str, String str2, boolean z10, boolean z11) {
            k71.k.g(str, "login");
            k71.k.g(str2, "fileName");
            this.f17283r = cVar;
            this.f17284s = str;
            this.f17285t = str2;
            this.f17286u = z10;
            this.f17287v = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f17283r.equals(fVar.f17283r) && k71.k.b(this.f17284s, fVar.f17284s) && k71.k.b(this.f17285t, fVar.f17285t) && this.f17286u == fVar.f17286u && this.f17287v == fVar.f17287v;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17287v) + x.i.e(h1.i(h1.i(this.f17283r.hashCode() * 31, this.f17284s, 31), this.f17285t, 31), 31, this.f17286u);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfileReadmeItem(bodyItem=");
            sb2.append(this.f17283r);
            sb2.append(", login=");
            sb2.append(this.f17284s);
            sb2.append(", fileName=");
            com.github.rudroid.m0.x(sb2, this.f17285t, ", isReadMoreExpanded=", this.f17286u, ", isOrganization=");
            return f4.s(sb2, this.f17287v, ")");
        }
    }

    public static final class g extends d {
    }
}
