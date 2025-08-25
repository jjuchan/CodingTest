import os
import re

# bj 폴더 안 전체 파일 탐색
root_dir = r"C:\Users\juchan\Desktop\study\CodingTest\bj"

for subdir, dirs, files in os.walk(root_dir):
    for file in files:
        if not file.endswith(".java"):
            continue

        file_path = os.path.join(subdir, file)

        # 경로를 패키지명으로 변환
        relative_path = os.path.relpath(subdir, root_dir)
        package_name = "bj"
        if relative_path != ".":
            package_name += "." + ".".join(relative_path.split(os.sep))

        # 파일 내용 읽고 package 선언 변경
        with open(file_path, 'r', encoding='utf-8') as f:
            code = f.read()

        # 기존 package bj; 또는 package ...; 대체
        code = re.sub(r'package\s+[\w.]+;', f'package {package_name};', code)

        # 파일 덮어쓰기
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(code)

        print(f"{file} → package {package_name} 변경 완료")
