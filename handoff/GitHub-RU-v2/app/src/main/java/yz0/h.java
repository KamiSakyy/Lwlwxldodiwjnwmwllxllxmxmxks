package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.Language;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.ProjectState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        switch (this.a) {
            case 0:
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                Avatar createFromParcel = Avatar.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                return new com.github.service.models.response.a(readString, createFromParcel, readString2, z6, parcel.readInt() == 0 ? z : true, parcel.readString());
            case 1:
                k71.k.g(parcel, "parcel");
                return new t(parcel.readString());
            case 2:
                k71.k.g(parcel, "parcel");
                return new u(parcel.readString());
            case 3:
                k71.k.g(parcel, "parcel");
                return new v(parcel.readString());
            case 4:
                k71.k.g(parcel, "parcel");
                return new w(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                k71.k.g(parcel, "parcel");
                return new x(parcel.readString());
            case 6:
                k71.k.g(parcel, "parcel");
                return new y(parcel.readString(), parcel.readString());
            case 7:
                k71.k.g(parcel, "parcel");
                return new a0(parcel.readString());
            case 8:
                k71.k.g(parcel, "parcel");
                return new b0(parcel.readString());
            case 9:
                k71.k.g(parcel, "parcel");
                return new d0(parcel.readString());
            case 10:
                k71.k.g(parcel, "parcel");
                return new e0(parcel.readString());
            case 11:
                k71.k.g(parcel, "parcel");
                return new g0(parcel.readString());
            case 12:
                k71.k.g(parcel, "parcel");
                return new h0(parcel.readString());
            case 13:
                k71.k.g(parcel, "parcel");
                return new i0(parcel.readString());
            case 14:
                k71.k.g(parcel, "parcel");
                return new k0(parcel.readString());
            case 15:
                k71.k.g(parcel, "parcel");
                return new l0(parcel.readString());
            case 16:
                k71.k.g(parcel, "parcel");
                return new m0(parcel.readString());
            case 17:
                k71.k.g(parcel, "parcel");
                return new o0(parcel.readString(), parcel.readString());
            case 18:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return p0.s;
            case 19:
                k71.k.g(parcel, "parcel");
                String readString3 = parcel.readString();
                Avatar createFromParcel2 = Avatar.CREATOR.createFromParcel(parcel);
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                boolean z7 = false;
                boolean z8 = true;
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z7 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z8 = z2;
                }
                if (parcel.readInt() == 0) {
                    z3 = z2;
                }
                return new b2(readString3, createFromParcel2, readString4, readString5, z7, z8, z3);
            case 20:
                k71.k.g(parcel, "parcel");
                return new Language(parcel.readString(), parcel.readString());
            case 21:
                k71.k.g(parcel, "parcel");
                return new LegacyProjectWithNumber(SimpleLegacyProject.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString());
            case 22:
                k71.k.g(parcel, "parcel");
                return new l2(parcel.readString());
            case 23:
                k71.k.g(parcel, "parcel");
                return new m2(IssueState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CloseReason.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 24:
                k71.k.g(parcel, "parcel");
                PullRequestState valueOf = PullRequestState.valueOf(parcel.readString());
                boolean z9 = false;
                boolean z10 = true;
                if (parcel.readInt() != 0) {
                    z4 = false;
                    z9 = true;
                } else {
                    z4 = false;
                }
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = true;
                    z10 = z4;
                }
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                int readInt = parcel.readInt();
                String readString9 = parcel.readString();
                boolean z12 = z5;
                String readString10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z12 = z4;
                }
                return new n2(valueOf, z9, z10, readString6, readString7, readString8, readInt, readString9, readString10, z12);
            case 25:
                k71.k.g(parcel, "parcel");
                return new s2(parcel.readString(), parcel.readString());
            case 26:
                k71.k.g(parcel, "parcel");
                Parcelable.Creator<s2> creator = s2.CREATOR;
                return new t2(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 27:
                k71.k.g(parcel, "parcel");
                return new SimpleLegacyProject(parcel.readString(), parcel.readString(), ProjectState.valueOf(parcel.readString()), parcel.readString());
            case 28:
                k71.k.g(parcel, "parcel");
                return new SimpleRepository(Avatar.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                k71.k.g(parcel, "parcel");
                return new SpokenLanguage(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new com.github.service.models.response.a[i];
            case 1:
                return new t[i];
            case 2:
                return new u[i];
            case 3:
                return new v[i];
            case 4:
                return new w[i];
            case 5:
                return new x[i];
            case 6:
                return new y[i];
            case 7:
                return new a0[i];
            case 8:
                return new b0[i];
            case 9:
                return new d0[i];
            case 10:
                return new e0[i];
            case 11:
                return new g0[i];
            case 12:
                return new h0[i];
            case 13:
                return new i0[i];
            case 14:
                return new k0[i];
            case 15:
                return new l0[i];
            case 16:
                return new m0[i];
            case 17:
                return new o0[i];
            case 18:
                return new p0[i];
            case 19:
                return new b2[i];
            case 20:
                return new Language[i];
            case 21:
                return new LegacyProjectWithNumber[i];
            case 22:
                return new l2[i];
            case 23:
                return new m2[i];
            case 24:
                return new n2[i];
            case 25:
                return new s2[i];
            case 26:
                return new t2[i];
            case 27:
                return new SimpleLegacyProject[i];
            case 28:
                return new SimpleRepository[i];
            default:
                return new SpokenLanguage[i];
        }
    }
}
