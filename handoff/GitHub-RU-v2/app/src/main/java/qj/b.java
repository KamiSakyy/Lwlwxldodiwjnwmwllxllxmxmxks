package qj;

import k71.k;
import sy.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends p7.a {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    public void a(v7.a aVar) {
        switch (this.c) {
            case 4:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `deeplink_hashes` (`hash` TEXT NOT NULL, `last_seen` INTEGER NOT NULL, PRIMARY KEY(`hash`))");
                break;
            case 5:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `repository_code_searches` (`query` TEXT NOT NULL, `repo_owner_and_name` TEXT NOT NULL, `performed_at` INTEGER NOT NULL, PRIMARY KEY(`query`, `repo_owner_and_name`))");
                break;
            case 6:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `chat_threads` (`id` TEXT NOT NULL, `selected_model` TEXT, PRIMARY KEY(`id`))");
                break;
            case 7:
                k.g(aVar, "connection");
                rShadow.q(aVar, "ALTER TABLE `shortcuts` ADD COLUMN `full_query_string` TEXT NOT NULL DEFAULT ''");
                break;
            case 8:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `ai_models` (`id` TEXT NOT NULL, `updated_at` TEXT NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 9:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `_new_ai_models` (`id` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                rShadow.q(aVar, "INSERT INTO `_new_ai_models` (`id`,`updated_at`) SELECT `id`,`updated_at` FROM `ai_models`");
                rShadow.q(aVar, "DROP TABLE `ai_models`");
                rShadow.q(aVar, "ALTER TABLE `_new_ai_models` RENAME TO `ai_models`");
                break;
            case 10:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `agent_tasks` (`task_id` TEXT NOT NULL, `task_title` TEXT NOT NULL, `task_state` TEXT NOT NULL, `task_is_draft` INTEGER NOT NULL, `task_is_queued` INTEGER NOT NULL, `task_uri` TEXT NOT NULL, `task_repo_owner` TEXT NOT NULL, `task_repo_name` TEXT NOT NULL, `task_number` INTEGER NOT NULL, `task_row_last_updated` TEXT NOT NULL, PRIMARY KEY(`task_id`))");
                break;
            case 11:
                k.g(aVar, "connection");
                break;
            case 12:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `mobile_push_notification_settings` (`push_notification_type` TEXT NOT NULL, `value` INTEGER NOT NULL, PRIMARY KEY(`push_notification_type`))");
                break;
            case 13:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `dashboard_nav_links` (`identifier` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`identifier`))");
                break;
            case 14:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `shortcuts` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `query` TEXT NOT NULL, `scope` TEXT NOT NULL, `type` TEXT NOT NULL, `color` TEXT NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 15:
                k.g(aVar, "connection");
                rShadow.q(aVar, "CREATE TABLE IF NOT EXISTS `pinned_items` (`name` TEXT NOT NULL, `id` TEXT NOT NULL, `owner` TEXT NOT NULL, `avatar` TEXT NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`id`))");
                break;
            default:
                super.a(aVar);
                break;
        }
    }

    public void b(w7.a aVar) {
        switch (this.c) {
            case 0:
                k.g(aVar, "db");
                aVar.x("DELETE FROM analytics_events");
                break;
            case 1:
                k.g(aVar, "db");
                zj.d.Companion.getClass();
                aVar.x("DROP TABLE notification_schedules");
                aVar.x("CREATE TABLE IF NOT EXISTS notification_schedules (\n    id TEXT NOT NULL,\n    day_of_week INTEGER NOT NULL PRIMARY KEY,\n    starts_at TEXT NOT NULL,\n    ends_at TEXT NOT NULL\n)");
                break;
            case 2:
                k.g(aVar, "db");
                xj.e.Companion.getClass();
                aVar.x("CREATE TABLE IF NOT EXISTS filter_bars (\n    id TEXT NOT NULL PRIMARY KEY,\n    filter TEXT\n)");
                break;
            case 3:
                k.g(aVar, "db");
                xj.e.Companion.getClass();
                aVar.x("ALTER TABLE filter_bars ADD COLUMN metadata TEXT NOT NULL DEFAULT ''");
                aVar.x(xj.e.e);
                break;
            default:
                super.b(aVar);
                break;
        }
    }
}
