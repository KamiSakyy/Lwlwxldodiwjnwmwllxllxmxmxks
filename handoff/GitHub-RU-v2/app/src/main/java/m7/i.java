package m7;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f28992a;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f28992a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        k71.k.g((d) iInterface, "callback");
        k71.k.g(obj, "cookie");
        this.f28992a.f3095s.remove((Integer) obj);
    }
}
