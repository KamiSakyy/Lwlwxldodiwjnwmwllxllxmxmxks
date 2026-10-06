package fc;

import a0.s0;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.issueorpullrequest.IssueType;
import f1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0067a();
    public List A;
    public IssueType B;

    /* renamed from: r, reason: collision with root package name */
    public String f24384r;

    /* renamed from: s, reason: collision with root package name */
    public String f24385s;

    /* renamed from: t, reason: collision with root package name */
    public String f24386t;

    /* renamed from: u, reason: collision with root package name */
    public String f24387u;

    /* renamed from: v, reason: collision with root package name */
    public String f24388v;

    /* renamed from: w, reason: collision with root package name */
    public String f24389w;

    /* renamed from: x, reason: collision with root package name */
    public Uri f24390x;

    /* renamed from: y, reason: collision with root package name */
    public String f24391y;

    /* renamed from: z, reason: collision with root package name */
    public List f24392z;

    /* renamed from: fc.a$a, reason: collision with other inner class name */
    public static final class C0067a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(a.class.getClassLoader());
            String readString7 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = e.b(a.class, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            int i10 = 0;
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i10 != readInt2) {
                i10 = e.b(a.class, parcel, arrayList2, i10, 1);
            }
            return new a(readString, readString2, readString3, readString4, readString5, readString6, uri, readString7, arrayList, arrayList2, parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, String str7, List list, List list2, IssueType issueType) {
        k.g(str, "repositoryId");
        k.g(str2, "repositoryOwner");
        k.g(str3, "repositoryName");
        k.g(list, "issueTemplateAssignees");
        k.g(list2, "issueTemplateLabels");
        this.f24384r = str;
        this.f24385s = str2;
        this.f24386t = str3;
        this.f24387u = str4;
        this.f24388v = str5;
        this.f24389w = str6;
        this.f24390x = uri;
        this.f24391y = str7;
        this.f24392z = list;
        this.A = list2;
        this.B = issueType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f24384r, aVar.f24384r) && k.b(this.f24385s, aVar.f24385s) && k.b(this.f24386t, aVar.f24386t) && k.b(this.f24387u, aVar.f24387u) && k.b(this.f24388v, aVar.f24388v) && k.b(this.f24389w, aVar.f24389w) && k.b(this.f24390x, aVar.f24390x) && k.b(this.f24391y, aVar.f24391y) && k.b(this.f24392z, aVar.f24392z) && k.b(this.A, aVar.A) && k.b(this.B, aVar.B);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.f24384r.hashCode() * 31, this.f24385s, 31), this.f24386t, 31);
        String str = this.f24387u;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24388v;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24389w;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.f24390x;
        int hashCode4 = (hashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str4 = this.f24391y;
        int c10 = e.c(this.A, e.c(this.f24392z, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        IssueType issueType = this.B;
        return c10 + (issueType != null ? issueType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("CreateIssueData(repositoryId=", this.f24384r, ", repositoryOwner=", this.f24385s, ", repositoryName=");
        e.x(o5, this.f24386t, ", parentIssueId=", this.f24387u, ", issueTitle=");
        e.x(o5, this.f24388v, ", issueBody=", this.f24389w, ", issueAttachment=");
        o5.append(this.f24390x);
        o5.append(", templateName=");
        o5.append(this.f24391y);
        o5.append(", issueTemplateAssignees=");
        o5.append(this.f24392z);
        o5.append(", issueTemplateLabels=");
        o5.append(this.A);
        o5.append(", issueTemplateIssueType=");
        o5.append(this.B);
        o5.append(")");
        return o5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f24384r);
        parcel.writeString(this.f24385s);
        parcel.writeString(this.f24386t);
        parcel.writeString(this.f24387u);
        parcel.writeString(this.f24388v);
        parcel.writeString(this.f24389w);
        parcel.writeParcelable(this.f24390x, i);
        parcel.writeString(this.f24391y);
        Iterator q10 = e.q(this.f24392z, parcel);
        while (q10.hasNext()) {
            parcel.writeParcelable((Parcelable) q10.next(), i);
        }
        Iterator q11 = e.q(this.A, parcel);
        while (q11.hasNext()) {
            parcel.writeParcelable((Parcelable) q11.next(), i);
        }
        parcel.writeParcelable(this.B, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, String str7, List list, List list2, IssueType issueType, int i) {
        this(str, str2, str3, str4, str5, str6, uri, str7, r0 != 0 ? r2 : list, (i & 512) != 0 ? r2 : list2, (i & 1024) != 0 ? null : issueType);
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        uri = (i & 64) != 0 ? null : uri;
        str7 = (i & 128) != 0 ? null : str7;
        int i10 = i & 256;
        List list3 = r.r;
    }
}
