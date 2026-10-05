package com.github.rudroid.releases;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class k implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18911r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ReleaseFragment f18912s;

    public /* synthetic */ k(ReleaseFragment releaseFragment, int i) {
        this.f18911r = i;
        this.f18912s = releaseFragment;
    }

    public final Object a() {
        switch (this.f18911r) {
            case k5.f.J /* 0 */:
                ReleaseFragment releaseFragment = this.f18912s;
                releaseFragment.I4();
                ReleaseFragment.K4(releaseFragment, MobileAppElement.VIEWER_PULL_TO_REFRESH, MobileAppAction.SWIPE, 4);
                break;
            default:
                this.f18912s.I4();
                break;
        }
        return w61.a0.a;
    }
}
