package wm;

import android.os.Parcelable;
import com.github.domain.shortcuts.model.ShortcutModel$Companion;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import g81.e;
import java.util.List;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public interface b extends Parcelable {
    public static final ShortcutModel$Companion Companion = ShortcutModel$Companion.a;

    ShortcutType K();

    String P();

    ShortcutColor f();

    List g();

    ShortcutIcon getIcon();

    String getName();

    com.github.service.models.response.shortcuts.a i();
}
