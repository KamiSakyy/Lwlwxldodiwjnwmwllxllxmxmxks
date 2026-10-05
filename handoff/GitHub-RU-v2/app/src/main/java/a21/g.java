package a21;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b1;
import androidx.fragment.app.g1;
import androidx.fragment.app.u0;
import b8.k;
import bb0.j;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter;
import com.github.domain.searchandfilter.filters.data.IsDraftFilter;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.LabelFilter;
import com.github.domain.searchandfilter.filters.data.LanguageFilter;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter;
import com.github.rudroid.common.h;
import com.github.rudroid.common.w;
import com.github.rudroid.common.x;
import com.github.service.models.response.Language;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.MilestoneState;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Locale;
import yz0.i5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                int b0 = k41.b.b0(parcel);
                String str = null;
                int i = 0;
                while (parcel.dataPosition() < b0) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = k41.b.F(parcel, readInt);
                    } else if (c != 2) {
                        k41.b.N(parcel, readInt);
                    } else {
                        str = k41.b.o(parcel, readInt);
                    }
                }
                k41.b.s(parcel, b0);
                return new Scope(str, i);
            case 1:
                int b02 = k41.b.b0(parcel);
                String str2 = null;
                z11.b bVar = null;
                int i2 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < b02) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i2 = k41.b.F(parcel, readInt2);
                    } else if (c2 == 2) {
                        str2 = k41.b.o(parcel, readInt2);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) k41.b.n(parcel, readInt2, PendingIntent.CREATOR);
                    } else if (c2 != 4) {
                        k41.b.N(parcel, readInt2);
                    } else {
                        bVar = (z11.b) k41.b.n(parcel, readInt2, z11.b.CREATOR);
                    }
                }
                k41.b.s(parcel, b02);
                return new Status(i2, str2, pendingIntent, bVar);
            case 2:
                a31.b bVar2 = new a31.b();
                bVar2.z = 255;
                bVar2.B = -2;
                bVar2.C = -2;
                bVar2.D = -2;
                bVar2.K = Boolean.TRUE;
                bVar2.r = parcel.readInt();
                bVar2.s = (Integer) parcel.readSerializable();
                bVar2.t = (Integer) parcel.readSerializable();
                bVar2.u = (Integer) parcel.readSerializable();
                bVar2.v = (Integer) parcel.readSerializable();
                bVar2.w = (Integer) parcel.readSerializable();
                bVar2.x = (Integer) parcel.readSerializable();
                bVar2.y = (Integer) parcel.readSerializable();
                bVar2.z = parcel.readInt();
                bVar2.A = parcel.readString();
                bVar2.B = parcel.readInt();
                bVar2.C = parcel.readInt();
                bVar2.D = parcel.readInt();
                bVar2.F = parcel.readString();
                bVar2.G = parcel.readString();
                bVar2.H = parcel.readInt();
                bVar2.J = (Integer) parcel.readSerializable();
                bVar2.L = (Integer) parcel.readSerializable();
                bVar2.M = (Integer) parcel.readSerializable();
                bVar2.N = (Integer) parcel.readSerializable();
                bVar2.O = (Integer) parcel.readSerializable();
                bVar2.P = (Integer) parcel.readSerializable();
                bVar2.Q = (Integer) parcel.readSerializable();
                bVar2.T = (Integer) parcel.readSerializable();
                bVar2.R = (Integer) parcel.readSerializable();
                bVar2.S = (Integer) parcel.readSerializable();
                bVar2.K = (Boolean) parcel.readSerializable();
                bVar2.E = (Locale) parcel.readSerializable();
                bVar2.U = (Boolean) parcel.readSerializable();
                bVar2.V = (Integer) parcel.readSerializable();
                return bVar2;
            case 3:
                return new androidx.fragment.app.b(parcel);
            case 4:
                return new androidx.fragment.app.c(parcel);
            case 5:
                u0 u0Var = new u0();
                u0Var.r = parcel.readString();
                u0Var.s = parcel.readInt();
                return u0Var;
            case 6:
                b1 b1Var = new b1();
                b1Var.v = null;
                b1Var.w = new ArrayList();
                b1Var.x = new ArrayList();
                b1Var.r = parcel.createStringArrayList();
                b1Var.s = parcel.createStringArrayList();
                b1Var.t = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                b1Var.u = parcel.readInt();
                b1Var.v = parcel.readString();
                b1Var.w = parcel.createStringArrayList();
                b1Var.x = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                b1Var.y = parcel.createTypedArrayList(u0.CREATOR);
                return b1Var;
            case 7:
                return new g1(parcel);
            case 8:
                return new k(parcel);
            case 9:
                k71.k.g(parcel, "parcel");
                return new bb0.f(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                k71.k.g(parcel, "parcel");
                return new bb0.g(parcel.readString(), parcel.readString(), MilestoneState.valueOf(parcel.readString()), parcel.readInt(), (ZonedDateTime) parcel.readSerializable());
            case 11:
                k71.k.g(parcel, "parcel");
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    boolean z3 = true;
                    if (i4 == readInt3) {
                        int readInt4 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt4);
                        int i5 = 0;
                        while (i5 != readInt4) {
                            i5 = f1.e.b(j.class, parcel, arrayList2, i5, 1);
                        }
                        i5 i5Var = (i5) parcel.readParcelable(j.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = true;
                            z3 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = z;
                        } else {
                            z2 = z;
                            z = false;
                        }
                        String readString = parcel.readString();
                        int readInt5 = parcel.readInt();
                        boolean z4 = z2;
                        ArrayList arrayList3 = new ArrayList(readInt5);
                        while (i3 != readInt5) {
                            i3 = f1.e.b(j.class, parcel, arrayList3, i3, z4 ? 1 : 0);
                        }
                        return new j(arrayList, arrayList2, i5Var, z3, z, readString, arrayList3);
                    }
                    i4 = f1.e.b(j.class, parcel, arrayList, i4, 1);
                }
            case 12:
                k71.k.g(parcel, "parcel");
                return new AgentTasksSortFilter(on.g.valueOf(parcel.readString()));
            case 13:
                k71.k.g(parcel, "parcel");
                return new AgentTasksStateFilter(cm.a.valueOf(parcel.readString()));
            case 14:
                k71.k.g(parcel, "parcel");
                int readInt6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = f1.e.b(AssigneeFilter.class, parcel, arrayList4, i6, 1);
                }
                return new AssigneeFilter(arrayList4);
            case 15:
                k71.k.g(parcel, "parcel");
                return new AuthorFilter((yz0.f) parcel.readParcelable(AuthorFilter.class.getClassLoader()));
            case 16:
                k71.k.g(parcel, "parcel");
                return new CustomFilter(parcel.readString());
            case 17:
                k71.k.g(parcel, "parcel");
                return new CustomInstructionsFilter(parcel.readParcelable(CustomInstructionsFilter.class.getClassLoader()));
            case 18:
                k71.k.g(parcel, "parcel");
                int readInt7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt7);
                for (int i7 = 0; i7 != readInt7; i7++) {
                    arrayList5.add(DiscussionCategoryData.CREATOR.createFromParcel(parcel));
                }
                return new DiscussionCategoryFilter(arrayList5);
            case 19:
                k71.k.g(parcel, "parcel");
                return new DiscussionStatusFilter(h.valueOf(parcel.readString()));
            case 20:
                k71.k.g(parcel, "parcel");
                return new DiscussionUserRelationshipFilter(bm.h.valueOf(parcel.readString()));
            case 21:
                k71.k.g(parcel, "parcel");
                return new DiscussionsIsUnansweredFilter(parcel.readInt() != 0);
            case 22:
                k71.k.g(parcel, "parcel");
                return new DiscussionsTopFilter(bm.j.valueOf(parcel.readString()));
            case 23:
                k71.k.g(parcel, "parcel");
                return new IsDraftFilter(parcel.readInt() != 0);
            case 24:
                k71.k.g(parcel, "parcel");
                return new IssueStatusFilter(w.valueOf(parcel.readString()));
            case 25:
                k71.k.g(parcel, "parcel");
                return new IssueTypeFilter((IssueType) parcel.readParcelable(IssueTypeFilter.class.getClassLoader()));
            case 26:
                k71.k.g(parcel, "parcel");
                return new IssueUserRelationshipFilter(x.valueOf(parcel.readString()));
            case 27:
                k71.k.g(parcel, "parcel");
                int readInt8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt8);
                int i8 = 0;
                while (i8 != readInt8) {
                    i8 = f1.e.b(LabelFilter.class, parcel, arrayList6, i8, 1);
                }
                return new LabelFilter(arrayList6);
            case 28:
                k71.k.g(parcel, "parcel");
                return new LanguageFilter((Language) parcel.readParcelable(LanguageFilter.class.getClassLoader()));
            default:
                k71.k.g(parcel, "parcel");
                int readInt9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt9);
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = f1.e.b(MilestoneFilter.class, parcel, arrayList7, i9, 1);
                }
                return new MilestoneFilter(arrayList7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Scope[i];
            case 1:
                return new Status[i];
            case 2:
                return new a31.b[i];
            case 3:
                return new androidx.fragment.app.b[i];
            case 4:
                return new androidx.fragment.app.c[i];
            case 5:
                return new u0[i];
            case 6:
                return new b1[i];
            case 7:
                return new g1[i];
            case 8:
                return new k[i];
            case 9:
                return new bb0.f[i];
            case 10:
                return new bb0.g[i];
            case 11:
                return new j[i];
            case 12:
                return new AgentTasksSortFilter[i];
            case 13:
                return new AgentTasksStateFilter[i];
            case 14:
                return new AssigneeFilter[i];
            case 15:
                return new AuthorFilter[i];
            case 16:
                return new CustomFilter[i];
            case 17:
                return new CustomInstructionsFilter[i];
            case 18:
                return new DiscussionCategoryFilter[i];
            case 19:
                return new DiscussionStatusFilter[i];
            case 20:
                return new DiscussionUserRelationshipFilter[i];
            case 21:
                return new DiscussionsIsUnansweredFilter[i];
            case 22:
                return new DiscussionsTopFilter[i];
            case 23:
                return new IsDraftFilter[i];
            case 24:
                return new IssueStatusFilter[i];
            case 25:
                return new IssueTypeFilter[i];
            case 26:
                return new IssueUserRelationshipFilter[i];
            case 27:
                return new LabelFilter[i];
            case 28:
                return new LanguageFilter[i];
            default:
                return new MilestoneFilter[i];
        }
    }
}
