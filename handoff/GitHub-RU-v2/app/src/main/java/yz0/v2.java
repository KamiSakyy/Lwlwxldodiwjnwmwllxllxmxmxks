package yz0;

import android.os.Parcelable;
import com.github.service.models.response.type.MilestoneState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public interface v2 extends Parcelable {
    ZonedDateTime A();

    String getId();

    String getName();

    MilestoneState getState();

    int v();
}
