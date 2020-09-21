package kr.teamcadi.sideproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_summary = (TextView)findViewById(R.id.tv_summary);
        TextView tv_director = (TextView)findViewById(R.id.tv_director);
        TextView tv_character = (TextView)findViewById(R.id.tv_character);
        tv_summary.setText("군도, 백성을 구하라\\n양반과 탐관오리들의 착취가 극에 달했던 조선 철종 13년.\\n힘 없는 백성의 편이 되어 세상을 바로잡고자하는 의적떼인 군도(群島), 지리산 추설이 있었다.\\n\\n쌍칼 도치 vs 백성의 적 조윤\\n잦은 자연재해, 기근과 관의 횡포까지 겹쳐 백성들의 삶이\\n날로 피폐해 져 가는 사이, 나주 대부호의 서자로 조선\\n최고의 무관 출신인 조윤은 극악한 수법으로 양민들을 수탈,\\n삼남지방 최고의 대부호로 성장한다. 한편 소, 돼지를 잡아\\n근근이 살아가던 천한 백정 돌무치는 죽어도 잊지 못할\\n끔찍한 일을 당한 뒤 군도에 합류, 지리산 추설의 신 거성(新\\n巨星) 도치로 거듭난다.\\n\\n뭉치면 백성, 흩어지면 도적!\\n망할 세상을 뒤집기 위해, 백성이 주인인 새 세상을 향해\\n도치를 필두로 한 군도는 백성의 적,\\n 조윤과 한 판 승부를\\n시작하는데...");
        tv_director.setText("윤종빈");
        tv_character.setText("하정우(도치), 강동원(조윤)");

    }
}