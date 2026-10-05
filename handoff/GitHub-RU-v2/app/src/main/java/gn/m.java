package gn;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.discussions.data.RepositoryDiscussionsIntentData$Basic;
import com.github.domain.discussions.data.RepositoryDiscussionsIntentData$Deeplink;
import com.github.domain.discussions.data.RepositoryDiscussionsIntentData$DeeplinkWithCategory;
import com.github.domain.discussions.data.RepositoryDiscussionsIntentData$OrganizationDeeplink;
import com.github.domain.discussions.data.RepositoryDiscussionsIntentData$WithCategory;
import com.github.domain.users.FetchUsersParams$FetchFollowingParams;
import com.github.domain.users.FetchUsersParams$FetchReacteesParams;
import com.github.domain.users.FetchUsersParams$FetchReleaseMentionsParams;
import com.github.domain.users.FetchUsersParams$FetchSponsoringParams;
import com.github.domain.users.FetchUsersParams$FetchStargazersParams;
import com.github.domain.users.FetchUsersParams$FetchWatchersParams;
import com.github.domain.users.UserViewType$Contributors;
import com.github.domain.users.UserViewType$Followers;
import com.github.domain.users.UserViewType$Following;
import com.github.domain.users.UserViewType$Reactees;
import com.github.domain.users.UserViewType$ReleaseMentions;
import com.github.domain.users.UserViewType$Sponsoring;
import com.github.domain.users.UserViewType$Stargazers;
import com.github.domain.users.UserViewType$Watchers;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.issueorpullrequest.IssueTypeColor;
import com.github.service.models.response.organizations.Organization;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.MilestoneState;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import yz0.i5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 0:
                k71.k.g(parcel, "parcel");
                return new FetchUsersParams$FetchFollowingParams(parcel.readString());
            case 1:
                k71.k.g(parcel, "parcel");
                return new FetchUsersParams$FetchReacteesParams(parcel.readString(), parcel.readString());
            case 2:
                k71.k.g(parcel, "parcel");
                return new FetchUsersParams$FetchReleaseMentionsParams(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                k71.k.g(parcel, "parcel");
                return new FetchUsersParams$FetchSponsoringParams(parcel.readString());
            case 4:
                k71.k.g(parcel, "parcel");
                return new FetchUsersParams$FetchStargazersParams(parcel.readString());
            case 5:
                k71.k.g(parcel, "parcel");
                return new FetchUsersParams$FetchWatchersParams(parcel.readString());
            case 6:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$Contributors.INSTANCE;
            case 7:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$Followers.INSTANCE;
            case 8:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$Following.INSTANCE;
            case 9:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$Reactees.INSTANCE;
            case 10:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$ReleaseMentions.INSTANCE;
            case 11:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$Sponsoring.INSTANCE;
            case 12:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$Stargazers.INSTANCE;
            case 13:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return UserViewType$Watchers.INSTANCE;
            case 14:
                k71.k.g(parcel, "parcel");
                return new h.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 15:
                k71.k.g(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                k71.k.d(readParcelable);
                return new h.h((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 16:
                k71.k.g(parcel, "parcel");
                return new IssueType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, IssueTypeColor.valueOf(parcel.readString()));
            case 17:
                k71.k.g(parcel, "parcel");
                return new h01.j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : CloseReason.valueOf(parcel.readString()), IssueState.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            case 18:
                h31.b bVar = new h31.b(parcel);
                bVar.r = ((Integer) parcel.readValue(h31.b.class.getClassLoader())).intValue();
                return bVar;
            case 19:
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                return new DiscussionCategoryData(readString, readString2, readString3, z4, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString());
            case 20:
                k71.k.g(parcel, "parcel");
                return new RepositoryDiscussionsIntentData$Basic(parcel.readString(), parcel.readString());
            case 21:
                k71.k.g(parcel, "parcel");
                return new RepositoryDiscussionsIntentData$Deeplink(parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                k71.k.g(parcel, "parcel");
                return new RepositoryDiscussionsIntentData$DeeplinkWithCategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                k71.k.g(parcel, "parcel");
                return new RepositoryDiscussionsIntentData$OrganizationDeeplink(parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                k71.k.g(parcel, "parcel");
                return new RepositoryDiscussionsIntentData$WithCategory(parcel.readString(), parcel.readString(), DiscussionCategoryData.CREATOR.createFromParcel(parcel));
            case 25:
                k71.k.g(parcel, "parcel");
                return new Organization(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Avatar) Avatar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 26:
                k71.k.g(parcel, "parcel");
                return new OrganizationNameAndAvatarUrl(parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                k71.k.g(parcel, "parcel");
                return new kx0.f(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                k71.k.g(parcel, "parcel");
                return new kx0.g(parcel.readString(), parcel.readString(), MilestoneState.valueOf(parcel.readString()), parcel.readInt(), (ZonedDateTime) parcel.readSerializable());
            default:
                k71.k.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (true) {
                    boolean z5 = true;
                    if (i2 == readInt) {
                        int readInt2 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt2);
                        int i3 = 0;
                        while (i3 != readInt2) {
                            i3 = f1.e.b(kx0.j.class, parcel, arrayList2, i3, 1);
                        }
                        i5 readParcelable2 = parcel.readParcelable(kx0.j.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = true;
                            z5 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                            z2 = false;
                        }
                        String readString4 = parcel.readString();
                        int readInt3 = parcel.readInt();
                        boolean z6 = z3;
                        ArrayList arrayList3 = new ArrayList(readInt3);
                        while (i != readInt3) {
                            i = f1.e.b(kx0.j.class, parcel, arrayList3, i, z6 ? 1 : 0);
                        }
                        return new kx0.j(arrayList, arrayList2, readParcelable2, z5, z2, readString4, arrayList3);
                    }
                    i2 = f1.e.b(kx0.j.class, parcel, arrayList, i2, 1);
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new FetchUsersParams$FetchFollowingParams[i];
            case 1:
                return new FetchUsersParams$FetchReacteesParams[i];
            case 2:
                return new FetchUsersParams$FetchReleaseMentionsParams[i];
            case 3:
                return new FetchUsersParams$FetchSponsoringParams[i];
            case 4:
                return new FetchUsersParams$FetchStargazersParams[i];
            case 5:
                return new FetchUsersParams$FetchWatchersParams[i];
            case 6:
                return new UserViewType$Contributors[i];
            case 7:
                return new UserViewType$Followers[i];
            case 8:
                return new UserViewType$Following[i];
            case 9:
                return new UserViewType$Reactees[i];
            case 10:
                return new UserViewType$ReleaseMentions[i];
            case 11:
                return new UserViewType$Sponsoring[i];
            case 12:
                return new UserViewType$Stargazers[i];
            case 13:
                return new UserViewType$Watchers[i];
            case 14:
                return new h.a[i];
            case 15:
                return new h.h[i];
            case 16:
                return new IssueType[i];
            case 17:
                return new h01.j[i];
            case 18:
                return new h31.b[i];
            case 19:
                return new DiscussionCategoryData[i];
            case 20:
                return new RepositoryDiscussionsIntentData$Basic[i];
            case 21:
                return new RepositoryDiscussionsIntentData$Deeplink[i];
            case 22:
                return new RepositoryDiscussionsIntentData$DeeplinkWithCategory[i];
            case 23:
                return new RepositoryDiscussionsIntentData$OrganizationDeeplink[i];
            case 24:
                return new RepositoryDiscussionsIntentData$WithCategory[i];
            case 25:
                return new Organization[i];
            case 26:
                return new OrganizationNameAndAvatarUrl[i];
            case 27:
                return new kx0.f[i];
            case 28:
                return new kx0.g[i];
            default:
                return new kx0.j[i];
        }
    }
}
