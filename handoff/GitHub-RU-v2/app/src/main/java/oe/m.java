package oe;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;
import le.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class m implements v, k, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public String A;
    public int B;
    public int C;

    /* renamed from: r, reason: collision with root package name */
    public String f30182r;

    /* renamed from: s, reason: collision with root package name */
    public String f30183s;

    /* renamed from: t, reason: collision with root package name */
    public String f30184t;

    /* renamed from: u, reason: collision with root package name */
    public int f30185u;

    /* renamed from: v, reason: collision with root package name */
    public CloseReason f30186v;

    /* renamed from: w, reason: collision with root package name */
    public IssueState f30187w;

    /* renamed from: x, reason: collision with root package name */
    public String f30188x;

    /* renamed from: y, reason: collision with root package name */
    public String f30189y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30190z;

    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new m(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : CloseReason.valueOf(parcel.readString()), IssueState.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    public m(String str, String str2, String str3, int i, CloseReason closeReason, IssueState issueState, String str4, String str5, boolean z10, String str6, int i10, int i11) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        k71.k.g(str3, "titleHTML");
        k71.k.g(issueState, "state");
        k71.k.g(str4, "repoOwner");
        k71.k.g(str5, "repoName");
        k71.k.g(str6, "stableId");
        this.f30182r = str;
        this.f30183s = str2;
        this.f30184t = str3;
        this.f30185u = i;
        this.f30186v = closeReason;
        this.f30187w = issueState;
        this.f30188x = str4;
        this.f30189y = str5;
        this.f30190z = z10;
        this.A = str6;
        this.B = i10;
        this.C = i11;
    }

    @Override // le.z
    public final String E() {
        return this.A;
    }

    @Override // oe.l
    public final int M() {
        return this.B;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.f30182r, mVar.f30182r) && k71.k.b(this.f30183s, mVar.f30183s) && k71.k.b(this.f30184t, mVar.f30184t) && this.f30185u == mVar.f30185u && this.f30186v == mVar.f30186v && this.f30187w == mVar.f30187w && k71.k.b(this.f30188x, mVar.f30188x) && k71.k.b(this.f30189y, mVar.f30189y) && this.f30190z == mVar.f30190z && k71.k.b(this.A, mVar.A) && this.B == mVar.B && this.C == mVar.C;
    }

    @Override // le.v
    public final int h() {
        return this.C;
    }

    public final int hashCode() {
        int b10 = s0.b(this.f30185u, h1.i(h1.i(this.f30182r.hashCode() * 31, this.f30183s, 31), this.f30184t, 31), 31);
        CloseReason closeReason = this.f30186v;
        return Integer.hashCode(this.C) + s0.b(this.B, h1.i(x.i.e(h1.i(h1.i((this.f30187w.hashCode() + ((b10 + (closeReason == null ? 0 : closeReason.hashCode())) * 31)) * 31, this.f30188x, 31), this.f30189y, 31), 31, this.f30190z), this.A, 31), 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("SelectableIssue(id=", this.f30182r, ", title=", this.f30183s, ", titleHTML=");
        s0.w(this.f30185u, this.f30184t, ", number=", ", closeReason=", o5);
        o5.append(this.f30186v);
        o5.append(", state=");
        o5.append(this.f30187w);
        o5.append(", repoOwner=");
        f1.e.x(o5, this.f30188x, ", repoName=", this.f30189y, ", repositoryIsPrivate=");
        m0.z(o5, this.f30190z, ", stableId=", this.A, ", searchResultType=");
        o5.append(this.B);
        o5.append(", itemType=");
        o5.append(this.C);
        o5.append(")");
        return o5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.f30182r);
        parcel.writeString(this.f30183s);
        parcel.writeString(this.f30184t);
        parcel.writeInt(this.f30185u);
        CloseReason closeReason = this.f30186v;
        if (closeReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(closeReason.name());
        }
        parcel.writeString(this.f30187w.name());
        parcel.writeString(this.f30188x);
        parcel.writeString(this.f30189y);
        parcel.writeInt(this.f30190z ? 1 : 0);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
    }
}
