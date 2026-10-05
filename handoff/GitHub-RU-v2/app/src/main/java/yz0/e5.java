package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ e5(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        switch (this.a) {
            case 0:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return f5.s;
            case 1:
                k71.k.g(parcel, "parcel");
                return new g5(parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                k71.k.g(parcel, "parcel");
                return new h5(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                k71.k.g(parcel, "parcel");
                return new i5(parcel.readString());
            case 4:
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = f1.e.b(j5.class, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = f1.e.b(j5.class, parcel, arrayList2, i, 1);
                }
                return new j5(readString, readString2, readString3, readString4, readString5, arrayList, arrayList2, parcel.readInt() == 0 ? null : IssueType.CREATOR.createFromParcel(parcel));
            case 5:
                k71.k.g(parcel, "parcel");
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(j5.CREATOR.createFromParcel(parcel));
                }
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList4.add(g5.CREATOR.createFromParcel(parcel));
                }
                i5 createFromParcel = parcel.readInt() == 0 ? null : i5.CREATOR.createFromParcel(parcel);
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                boolean z3 = parcel.readInt() != 0 ? z : false;
                String readString6 = parcel.readString();
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    arrayList5.add(h5.CREATOR.createFromParcel(parcel));
                }
                return new l5(arrayList3, arrayList4, createFromParcel, z2, z3, readString6, arrayList5);
            case 6:
                k71.k.g(parcel, "parcel");
                return new t7(parcel.readString(), parcel.readString(), parcel.readString(), Avatar.CREATOR.createFromParcel(parcel), (n5) parcel.readParcelable(t7.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 7:
                k71.k.g(parcel, "parcel");
                return TrendingPeriod.valueOf(parcel.readString());
            case 8:
                k71.k.g(parcel, "parcel");
                return new e8(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                k71.k.g(parcel, "parcel");
                return new o8(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : OrganizationNameAndAvatarUrl.CREATOR.createFromParcel(parcel), parcel.readString(), (ZonedDateTime) parcel.readSerializable());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f5[i];
            case 1:
                return new g5[i];
            case 2:
                return new h5[i];
            case 3:
                return new i5[i];
            case 4:
                return new j5[i];
            case 5:
                return new l5[i];
            case 6:
                return new t7[i];
            case 7:
                return new TrendingPeriod[i];
            case 8:
                return new e8[i];
            default:
                return new o8[i];
        }
    }
}
