from kivy import *
from kivymd.app import MDApp
from kivy.lang import Builder


class Test(MDApp):

    def build(self):
        self.title = "Programming"
        self.theme_cls.primary_palette = "Black"
        return Builder.load_string(
            '''

BoxLayout:
    orientation:'vertical'
    MDToolbar:
        title: 'Programming'
        md_bg_color: app.theme_cls.primary_color
        specific_text_color: 1, 1, 1, 1

    MDBottomNavigation:
        
        MDBottomNavigationItem:
             name: 'screen 1'
             text: 'Python'
             icon: 'language-python'

             image:
                  id: imageView
                  source: 'python.png'

        MDBottomNavigationItem:
                name: 'screen 2'
                text: 'C++'
                icon: 'language-cpp'

                Image:
                    id: imageView
                    source: 'c++.png'
    '''
        )
    

Test().run()
