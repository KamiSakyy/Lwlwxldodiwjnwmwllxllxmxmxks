package l01;

import android.os.Parcelable;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectV2Field$Companion;

@g81.e
/* loaded from: /home/user/work/p/classes4.dex */
public interface j0 extends Parcelable {
    public static final ProjectV2Field$Companion Companion = ProjectV2Field$Companion.a;

    String getId();

    String getName();

    ProjectFieldType l();
}
