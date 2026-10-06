package le;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Avatar f28491a;

    /* renamed from: b, reason: collision with root package name */
    public String f28492b;

    /* renamed from: c, reason: collision with root package name */
    public String f28493c;

    /* renamed from: d, reason: collision with root package name */
    public String f28494d;

    /* renamed from: e, reason: collision with root package name */
    public String f28495e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28496f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28497g;

    /* renamed from: h, reason: collision with root package name */
    public String f28498h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28499j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28500k;

    public /* synthetic */ h(Avatar avatar, String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, int i, int i10) {
        this(avatar, str, str2, str3, str4, z10, z11, str5, i, (i10 & 512) == 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.f28491a, hVar.f28491a) && k71.k.b(this.f28492b, hVar.f28492b) && k71.k.b(this.f28493c, hVar.f28493c) && k71.k.b(this.f28494d, hVar.f28494d) && k71.k.b(this.f28495e, hVar.f28495e) && this.f28496f == hVar.f28496f && this.f28497g == hVar.f28497g && k71.k.b(this.f28498h, hVar.f28498h) && this.i == hVar.i && this.f28499j == hVar.f28499j && this.f28500k == hVar.f28500k;
    }

    public final int hashCode() {
        Avatar avatar = this.f28491a;
        int i = h1.i(h1.i((avatar == null ? 0 : avatar.hashCode()) * 31, this.f28492b, 31), this.f28493c, 31);
        String str = this.f28494d;
        int e5 = x.i.e(x.i.e(h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.f28495e, 31), 31, this.f28496f), 31, this.f28497g);
        String str2 = this.f28498h;
        return Boolean.hashCode(this.f28500k) + x.i.e(s0.b(this.i, (e5 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f28499j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListItemHeaderTitle(avatar=");
        sb2.append(this.f28491a);
        sb2.append(", ownerLogin=");
        sb2.append(this.f28492b);
        sb2.append(", title=");
        f1.e.x(sb2, this.f28493c, ", titleHTML=", this.f28494d, ", repoName=");
        m0.x(sb2, this.f28495e, ", viewerIsAuthor=", this.f28496f, ", canManage=");
        m0.z(sb2, this.f28497g, ", id=", this.f28498h, ", number=");
        m0.w(sb2, this.i, ", showOptions=", this.f28499j, ", hideRepositoryName=");
        return f4.s(sb2, this.f28500k, ")");
    }

    public h(Avatar avatar, String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, int i, boolean z12, boolean z13) {
        k71.k.g(str, "ownerLogin");
        k71.k.g(str2, "title");
        k71.k.g(str4, "repoName");
        this.f28491a = avatar;
        this.f28492b = str;
        this.f28493c = str2;
        this.f28494d = str3;
        this.f28495e = str4;
        this.f28496f = z10;
        this.f28497g = z11;
        this.f28498h = str5;
        this.i = i;
        this.f28499j = z12;
        this.f28500k = z13;
    }

    public h(int i, String str, String str2, String str3) {
        this(null, str, str3, null, str2, false, false, null, i, 1536);
    }

    public Object i;
}
