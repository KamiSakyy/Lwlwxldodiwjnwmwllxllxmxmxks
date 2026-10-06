package x4;

import android.util.Base64;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f33755a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33756b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33757c;

    /* renamed from: d, reason: collision with root package name */
    public final List f33758d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33759e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33760f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33761g;

    public c(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        this.f33755a = str;
        str2.getClass();
        this.f33756b = str2;
        this.f33757c = str3;
        list.getClass();
        this.f33758d = list;
        this.f33759e = str4;
        this.f33760f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f33761g = x.i.k(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f33755a + ", mProviderPackage: " + this.f33756b + ", mQuery: " + this.f33757c + ", mSystemFont: " + this.f33759e + ", mVariationSettings: " + this.f33760f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f33758d;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
