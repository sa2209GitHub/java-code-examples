"plugins (https://vimawesome.com)
call plug#begin('~/.vim/plugged')

Plug 'scrooloose/nerdtree', { 'on':  'NERDTreeToggle' }
Plug 'ycm-core/YouCompleteMe'
Plug 'jiangmiao/auto-pairs'
Plug 'tpope/vim-fugitive'
Plug 'airblade/vim-gitgutter'
Plug 'kien/ctrlp.vim'
Plug 'easymotion/vim-easymotion'

Plug 'jacoborus/tender'
Plug 'morhetz/gruvbox'

call plug#end()

let NERDTreeShowHidden=0
let g:mapleader=','

"colorscheme gruvbox

"set background=dark
set number
set expandtab
set tabstop=2
set shiftwidth=2
set hlsearch
set incsearch

"mappings
map <C-n> :NERDTreeToggle<CR>
map <Leader> <Plug>(easymotion-prefix)
