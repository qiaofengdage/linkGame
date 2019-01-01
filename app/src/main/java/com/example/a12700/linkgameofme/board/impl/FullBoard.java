package com.example.a12700.linkgameofme.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.a12700.linkgameofme.board.AbstractBoard;
import com.example.a12700.linkgameofme.utils.GameConf;
import com.example.a12700.linkgameofme.view.Piece;

/**
 * 创建矩阵分布的游戏区域，矩阵排列的方块会填满二维数组的每个数组元素，只是把四周留空而已 <br/>
 * <br/>
 * 关于本代码介绍可以参考一下博客: <a href="http://blog.csdn.net/ouyang_peng">欧阳鹏的CSDN博客</a> <br/>
 */
public class FullBoard extends AbstractBoard {
    @Override
    protected List<Piece> createPieces(GameConf config, Piece[][] pieces) {
        // 创建一个Piece集合, 该集合里面存放初始化游戏时所需的Piece对象
        List<Piece> notNullPieces = new ArrayList<Piece>();
        for (int i = 1; i < pieces.length - 1; i++) {
            for (int j = 1; j < pieces[i].length - 1; j++) {
                // 先构造一个Piece对象, 只设置它在Piece[][]数组中的索引值，
                // 所需要的PieceImage由其父类负责设置。
                Piece piece = new Piece(i, j);
                // 添加到Piece集合中
                notNullPieces.add(piece);
            }
        }
        return notNullPieces;
    }
}
