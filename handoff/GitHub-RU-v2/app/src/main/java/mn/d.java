package mn;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public a b;
    public Avatar c;
    public Integer d;
    public Object e;
    public x01.i f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;
    public String k;

    public d(String str, a aVar, Avatar avatar, Integer num, List list, x01.i iVar, boolean z, boolean z2, String str2, String str3, String str4) {
        this.a = str;
        this.b = aVar;
        this.c = avatar;
        this.d = num;
        this.e = list;
        this.f = iVar;
        this.g = z;
        this.h = z2;
        this.i = str2;
        this.j = str3;
        this.k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d) && k71.k.b(this.e, dVar.e) && k71.k.b(this.f, dVar.f) && this.g == dVar.g && this.h == dVar.h && k71.k.b(this.i, dVar.i) && k71.k.b(this.j, dVar.j) && k71.k.b(this.k, dVar.k);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Avatar avatar = this.c;
        int hashCode2 = (hashCode + (avatar == null ? 0 : avatar.hashCode())) * 31;
        Integer num = this.d;
        int e = x.i.e(x.i.e((this.f.hashCode() + h1.h((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, this.e, 31)) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int hashCode3 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionCheckRunWithSteps(checkSuiteId=");
        sb.append(this.a);
        sb.append(", checkRun=");
        sb.append(this.b);
        sb.append(", checkSuiteAppAvatar=");
        sb.append(this.c);
        sb.append(", workflowRunNumber=");
        sb.append(this.d);
        sb.append(", steps=");
        sb.append(this.e);
        sb.append(", page=");
        sb.append(this.f);
        sb.append(", viewerCanManageActions=");
        m0.A(sb, this.g, ", rerunnable=", this.h, ", ownerName=");
        f1.e.x(sb, this.i, ", repoName=", this.j, ", branchName=");
        return h1.p(sb, this.k, ")");
    }

    public /* synthetic */ d(a aVar, x01.i iVar, String str, String str2, int i) {
        this(null, aVar, null, null, x61.rShadow.r, iVar, false, false, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, null);
    }
}
