package pers.noxcode.archivemanager.core.inerface;
import pers.noxcode.archivemanager.data.entity.Archive;
import pers.noxcode.archivemanager.data.entity.Game;

/**
 * <p>这个类用于实现一下游戏的通用的管理功能，安装游戏，卸载游戏，下载游戏，加载历史游戏数据，保存游戏数据，上传游戏数据，上传游戏数据
 * <p>由于资金原因，暂时还没有云服务器
 * @author van人之雄
 * @version 1.0
 * @date 2021.09.19
 */
@SuppressWarnings("unused")
public interface GameManager {
    /**
     *通过游戏的名字，从云服务器上下载游戏到本地的默认路径并安装
     * @param game 游戏{@link Game}
     * @see Game
     */
    void installGame(Game game);
    /**
     * 通过游戏的名字，从云服务器上下载游戏到本地指定的目录，并安装
     * @param game 游戏{@link Game}
     * @param destPath 游戏的安装目录
     * @see Game
     */
    void installGame(Game game, String destPath);
    /**
     * 加载本地的游戏到管理器
     * @param game 游戏信息
     * @param path 游戏安装目录
     * @throws Exception 游戏目录不存在
     */
    void loadLocalGam(Game game, String path) throws Exception;
    /**
     * 卸载游戏,卸载时应保存好存档
     * @param game 游戏{@link Game}
     * @see Game
     */
    void unInstallGame(Game game);
    /**
     * <p>从与服务器上加载指定存档，要求本地必须安装好对应的游戏
     * <p>如果此游戏已有存档应先保存好现在的存档，再替换
     * @param archive 指定存档{@link Archive}
     * @throws Exception 游戏未安装抛出异常
     * @see Archive
     */
    void loadArchives(Archive archive) throws Exception;
    /**
     * 加载本地的存档文件到管理器
     * @param archive 存档信息
     * @param path 存档目录
     * @throws Exception path不存在
     */
    void loadLocalArchives(Archive archive, String path)throws Exception;
    /**
     * 获取本地游戏列表
     * @return {@link Game}返回本地安装的游戏(管理器已加载的）
     */
    Game[] getLocalGames();
    /**
     * 获取云服务上的游戏列表
     * @return {@link Game}返回云服务器上的游戏列表
     */
    Game[] getGames();
    /**
     * 获取本地仓库的存档
     * @return {@link Archive}本地仓库的所有存档
     */
    Archive[] getLocalArchives();
    /**
     * 获取云服务器上的存档档列表
     * @return {@link Archive} 云服务器的存档列表
     */
    Archive[] getArchives();
    /**
     * 上传本地游戏到云服务器上去
     * @param game 游戏信息
     * @param path 游戏安装目录
     * @throws Exception 游戏安装目录未找到
     */
    void uploadGame(Game game, String path)throws Exception;
    /**
     * 上传本地仓库所有的存档
     */
    void uploadArchives();
    /**
     * 上传指定存档到服务器
     * @param archive 指定存档
     */
    void uploadArchives(Archive archive);
}
